package com.pdurasek
import com.pdurasek.mappers.FooMapper
import com.pdurasek.models.Bar
import io.micronaut.runtime.EmbeddedApplication
import io.micronaut.test.extensions.kotest.annotation.MicronautTest
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

@MicronautTest
class MapperTest(private val fooMapper: FooMapper): StringSpec({

    "test the mapper" {
        val bar = Bar(1337, "foo")

        val foo = fooMapper.mapFoo(bar)

        foo.number shouldBe bar.number
    }
})
