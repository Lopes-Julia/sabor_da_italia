package br.eti.jblf.sabordaitalia.domain.repository;
import br.eti.jblf.sabordaitalia.domain.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
}
