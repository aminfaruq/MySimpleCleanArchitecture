package co.id.aminfaruq.mysimplecleanarchitecture.di

import co.id.aminfaruq.mysimplecleanarchitecture.data.IMessageDataSource
import co.id.aminfaruq.mysimplecleanarchitecture.data.MessageDataSource
import co.id.aminfaruq.mysimplecleanarchitecture.data.MessageRepository
import co.id.aminfaruq.mysimplecleanarchitecture.domain.IMessageRepository
import co.id.aminfaruq.mysimplecleanarchitecture.domain.MessageInteractor
import co.id.aminfaruq.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {

    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}