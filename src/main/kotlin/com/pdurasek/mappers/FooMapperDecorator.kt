package com.pdurasek.mappers

import com.pdurasek.models.Bar
import com.pdurasek.models.Foo
import javax.inject.Inject
import javax.inject.Named

abstract class FooMapperDecorator : FooMapper() {

    @Inject
    @Named("com.pdurasek.mappers.FooMapperImpl_")
    lateinit var delegate: FooMapper

    override fun mapFoo(bar: Bar): Foo {
        return delegate.mapFoo(bar)
    }
}