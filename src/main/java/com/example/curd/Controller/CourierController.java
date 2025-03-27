package com.example.curd.Controller;

import com.example.curd.Model.Courier;
import com.example.curd.Repository.CourierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/couriers")
public class CourierController {

    @Autowired
    private CourierRepository courierRepository;

    @GetMapping
    public List<Courier> getAllCouriers() {
        return courierRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Courier> getCourierById(@PathVariable Integer id) {
        Optional<Courier> courier = courierRepository.findById(id);
        return courier.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Courier createCourier(@RequestBody Courier courier) {
        return courierRepository.save(courier);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Courier> updateCourier(@PathVariable Integer id, @RequestBody Courier courierDetails) {
        Optional<Courier> optionalCourier = courierRepository.findById(id);
        if (optionalCourier.isPresent()) {
            Courier courier = optionalCourier.get();
            courier.setOrderDate(courierDetails.getOrderDate());
            courier.setCustomerName(courierDetails.getCustomerName());
            courier.setAddress(courierDetails.getAddress());
            courier.setDeliveryLocation(courierDetails.getDeliveryLocation());
            courier.setWhatsapp(courierDetails.getWhatsapp());
            courier.setContact(courierDetails.getContact());
            courier.setPayment(courierDetails.getPayment());
            courier.setItems(courierDetails.getItems());
            courier.setVendor(courierDetails.getVendor());
            courier.setSupplier(courierDetails.getSupplier());
            courier.setParcelService(courierDetails.getParcelService());
            courier.setBookingStatus(courierDetails.getBookingStatus());
            courier.setDeliveryStatus(courierDetails.getDeliveryStatus());
            courier.setBookedDate(courierDetails.getBookedDate());
            courier.setLrNumber(courierDetails.getLrNumber());
            courier.setPaymentStatus(courierDetails.getPaymentStatus());

            return ResponseEntity.ok(courierRepository.save(courier));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCourier(@PathVariable Integer id) {
        if (courierRepository.existsById(id)) {
            courierRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
