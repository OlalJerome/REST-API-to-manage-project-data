public static void main(String[] args) {
  @RestController
  @RequestMapping("/products")
  public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public Page<Product> getProducts(
        @RequestParam(defaultValue = "0") int page,
        @RequestParam(defaultValue = "10") int size,
        @RequestParam(defaultValue = "id") String sort) {
      return productRepository.findAll(PageRequest.of(page, size, Sort.by(sort)));
    }
  }
}
