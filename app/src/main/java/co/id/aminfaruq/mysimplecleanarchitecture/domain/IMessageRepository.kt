package co.id.aminfaruq.mysimplecleanarchitecture.domain

interface IMessageRepository {
    fun getWelcomeMessage(name : String) : MessageEntity
}