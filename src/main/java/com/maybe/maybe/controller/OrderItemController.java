//package com.maybe.maybe.controller;
//
//import com.maybe.maybe.entity.OrderItem;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Optional;
//
//@RestController
//@RequestMapping("api/orders/id/items")
//public class OrderItemController {
//
//    private OrderItemService orderItemService;
//
//    public OrderItemController(OrderItemService orderItemService) {
//        this.orderItemService = orderItemService;
//    }
//
//    @GetMapping
//    public ResponseEntity<?> getAllItems() {
//        return ResponseEntity.of(Optional.of(orderItemService.getAll()));
//    }
//
//    @GetMapping("/id")
//    public ResponseEntity<?> getById(@PathVariable("id") Long id){
//
//        Optional<OrderItem> orderItem = orderItemService.getById(id);
//
//        if (!orderItem.isPresent()){
//            return ResponseEntity.status(404).build();
//        }
//
//        return ResponseEntity.ok(Optional.of(orderItem));
//    }
//}
