package hr.algebra.tourirst_backend_spring.repository

import hr.algebra.tourirst_backend_spring.entity.Sight
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface SightRepository : CrudRepository<Sight, String>