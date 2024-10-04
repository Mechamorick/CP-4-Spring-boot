
@RestController
@RequestMapping("/clientes")
class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<ClienteDTO> getAllClientes() {
        return clienteService.findAll().stream()
                .map(cliente -> new ClienteDTO(cliente.getId(), cliente.getNome(), cliente.getBairro(), cliente.getCep(),
                        cliente.getComplemento(), cliente.getLogradouro(), cliente.getMunicipio(), cliente.getNumero(),
                        cliente.getUf()))
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ClienteDTO getClienteById(@PathVariable Long id) {
        Cliente cliente = clienteService.findById(id);
        return new ClienteDTO(cliente.getId(), cliente.getNome(), cliente.getBairro(), cliente.getCep(),
                cliente.getComplemento(), cliente.getLogradouro(), cliente.getMunicipio(), cliente.getNumero(),
                cliente.getUf());
    }

    @PostMapping
    public ClienteDTO createCliente(@RequestBody ClienteDTO clienteDTO) {
        Cliente cliente = new Cliente();
        cliente.setNome(clienteDTO.getNome());
        cliente.setBairro(clienteDTO.getBairro());
        cliente.setCep(clienteDTO.getCep());
        cliente.setComplemento(clienteDTO.getComplemento());
        cliente.setLogradouro(clienteDTO.getLogradouro());
        cliente.setMunicipio(clienteDTO.getMunicipio());
        cliente.setNumero(clienteDTO.getNumero());
        cliente.setUf(clienteDTO.getUf());
        Cliente savedCliente = clienteService.save(cliente);
        return new ClienteDTO(savedCliente.getId(), savedCliente.getNome(), savedCliente.getBairro(),
                savedCliente.getCep(), savedCliente.getComplemento(), savedCliente.getLogradouro(),
                savedCliente.getMunicipio(), savedCliente.getNumero(), savedCliente.getUf());
    }

    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable Long id) {
        clienteService.deleteById(id);
    }
}
