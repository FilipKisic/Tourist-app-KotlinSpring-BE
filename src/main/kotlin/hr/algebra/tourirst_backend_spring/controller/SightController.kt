package hr.algebra.tourirst_backend_spring.controller

import hr.algebra.tourirst_backend_spring.entity.Sight
import hr.algebra.tourirst_backend_spring.service.SightService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController()
@RequestMapping("sight")
class SightController(val sightService: SightService) {
    @GetMapping("/all")
    fun getAll(): List<Sight> = sightService.getAll()

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long) = sightService.getById(id)

    @PostMapping("/save")
    fun save(@RequestBody sight: Sight) = sightService.save(sight)

    @DeleteMapping("/")
    fun delete(@RequestBody sight: Sight) = sightService.delete(sight)

    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable id: Long) = sightService.deleteById(id)
}