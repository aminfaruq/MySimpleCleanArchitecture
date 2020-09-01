package co.id.aminfaruq.mysimplecleanarchitecture.data

import co.id.aminfaruq.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String): MessageEntity =
        MessageEntity("Hello $name! Welcome to Clean Architecture")

}