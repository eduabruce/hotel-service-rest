package hotel_service.controller;

import hotel_service.model.Hotel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/hoteis")
public class HotelController {

    private static final List<Hotel> HOTEIS_MOCK = List.of(
            new Hotel(1L, "Tropical Executive Hotel", "Manaus", new BigDecimal("450.00"), 4, true),
            new Hotel(2L, "Hotel Juma Ópera", "Manaus", new BigDecimal("890.00"), 5, true),
            new Hotel(3L, "Blue Tree Premium", "Manaus", new BigDecimal("380.00"), 4, false),
            new Hotel(4L, "Ibis Manaus Aeroporto", "Manaus", new BigDecimal("260.00"), 3, true)
    );

    @GetMapping
    public ResponseEntity<List<Hotel>> listarTodos() {
        return ResponseEntity.ok(HOTEIS_MOCK);
    }
}