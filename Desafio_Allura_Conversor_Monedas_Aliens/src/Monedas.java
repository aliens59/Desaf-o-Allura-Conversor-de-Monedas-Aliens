//clase record que  representa los parametros de equivalencia de moneda para el conversor

public record Monedas (String base_code,
                       String target_code,
                       double conversion_rate
)
{
}

