package br.eti.jblf.sabordaitalia.domain.repository;
import br.eti.jblf.sabordaitalia.domain.model.Pedido;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{
    
    List<Pedido> findByStatus(String status);

}