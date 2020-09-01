package co.id.aminfaruq.mysimplecleanarchitecture.data

import co.id.aminfaruq.mysimplecleanarchitecture.domain.IMessageRepository
import co.id.aminfaruq.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource : IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity {
        return messageDataSource.getMessageFromSource(name)
    }
}