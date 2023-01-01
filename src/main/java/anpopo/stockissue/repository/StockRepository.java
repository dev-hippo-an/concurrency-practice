package anpopo.stockissue.repository;

import anpopo.stockissue.domain.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Long> {
}