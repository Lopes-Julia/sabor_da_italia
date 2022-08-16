package br.eti.jblf.sabordaitalia.domain.service;
import br.eti.jblf.sabordaitalia.domain.model.Pedido;
import br.eti.jblf.sabordaitalia.domain.model.StatusPedido;
import br.eti.jblf.sabordaitalia.domain.repository.PedidoRepository;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {
    
    @Autowired
    private PedidoRepository pedidoRepository;
    
    public Pedido salvar(Pedido pedido) {
        pedido.setAbertoEm(LocalDateTime.now());
        pedido.setStatus(StatusPedido.ABERTO);
        
        return pedidoRepository.save(pedido);
    }
    
}
