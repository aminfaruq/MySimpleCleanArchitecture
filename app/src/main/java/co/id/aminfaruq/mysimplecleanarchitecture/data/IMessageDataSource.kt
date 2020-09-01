package co.id.aminfaruq.mysimplecleanarchitecture.data

import co.id.aminfaruq.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name : String) : MessageEntity
}