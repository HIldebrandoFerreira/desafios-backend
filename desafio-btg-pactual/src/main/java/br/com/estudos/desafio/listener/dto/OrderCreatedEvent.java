package br.com.estudos.desafio.listener.dto;

import java.math.BigDecimal;
import java.util.List;

public record OrderCreatedEvent(
        Long codigoPedido,
        Long codigoCliente,
        List<OrderItemEvent> itens
) {}
