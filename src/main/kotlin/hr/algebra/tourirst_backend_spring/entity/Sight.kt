package hr.algebra.tourirst_backend_spring.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("SIGHT")
data class Sight(
        @Id
        val id: String?,
        val title: String,
        val description: String?,
        val address: String?,
        val lat: Double,
        val lng: Double,
        val rating: Int
)
