package br.com.zupacademy.giovannimoratto.autor

import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface AutorRepository : JpaRepository<AutorModel, Long> {

    fun getByEmail(email: String): AutorModel?
    fun getById(id: Long): AutorModel?

}
