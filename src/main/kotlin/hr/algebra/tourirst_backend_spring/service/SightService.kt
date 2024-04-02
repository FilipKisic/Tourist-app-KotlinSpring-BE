package hr.algebra.tourirst_backend_spring.service

import hr.algebra.tourirst_backend_spring.entity.Sight
import hr.algebra.tourirst_backend_spring.repository.SightRepository
import org.springframework.stereotype.Service
import java.util.Optional

@Service
class SightService(val repository: SightRepository) {
    fun getAll(): List<Sight> = repository.findAll().toList()

    fun getById(id: Long): Optional<Sight> = repository.findById(id)

    fun save(sight: Sight) = repository.save(sight)

    fun delete(sight: Sight) = repository.delete(sight)

    fun deleteById(id: Long) = repository.deleteById(id)
}