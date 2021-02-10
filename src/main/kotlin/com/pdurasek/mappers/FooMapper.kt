package com.pdurasek.mappers

import com.pdurasek.models.Bar
import com.pdurasek.models.Foo
import org.mapstruct.DecoratedWith
import org.mapstruct.Mapper

@Mapper(componentModel = "jsr330")
@DecoratedWith(FooMapperDecorator::class)
abstract class FooMapper {
    abstract fun mapFoo(bar: Bar): Foo
}