# TASK MULTITHREADING
*Разработать многопоточное приложение, использующее разделяемые ресурсы. В приложении должна быть реализована функциональность, определенная индивидуальным заданием.*<br/>

## Requirements

➢ Любая сущность, желающая получить доступ к разделяемому ресурсу, должна быть потоком.<br/>
➢ Программа должна использовать возможности синхронизации, поставляемые библиотеками java.util.concurrent, java.util.concurrent.atomic и java.util.concurrent.locks.<br/>
➢ Не использовать synchronized, volatile, а также BlockingQueue и другие ограниченно потокобезопасные коллекции.<br/>
➢ Классы и другие сущности приложения должны быть грамотно структурированы по пакетам и иметь отражающую их функциональность название.<br/>
➢ Использовать шаблон State для описания состояний объекта, если только этих состояний больше двух.<br/>
➢ Для создания потоков разрешается использовать по возможности **Callable**. <br/>
➢ Запускать потоки с помощью ExecutorService.<br/>
➢ Вместо Thread.sleep использовать только возможности перечисления TimeUnit.<br/>
➢ Данные инициализации объектов считывать из файла. Данные в файле корректны.<br/>
➢ В приложении должен присутствовать потокобезопасный Singleton. При его создании запрещено использовать **enum**.<br/>
➢ Для записи логов использовать **Log4J2**.
➢ Для вывода работы потоков использовать метод **main**.


➢ Any entity that wants to access a shared resource must be a thread.<br/>
➢ The program must use the synchronization capabilities provided by the java.util.concurrent, java.util.concurrent.atomic, and java.util.concurrent.locks libraries.<br/>
➢ Do not use synchronized, volatile, as well as BlockingQueue and other restrictedly thread-safe collections.<br/>
➢ Classes and other entities of the application must be well-structured into packages and have a name that reflects their functionality.<br/>
➢ Use the State template to describe object states, unless there are more than two states.<br/>
➢ To create flows, it is allowed to use Callable if possible
➢ Run threads using ExecutorService.<br/>
➢ Instead of Thread.sleep, use only the capabilities of the TimeUnit enum.
➢ Read object initialization data from file. The data in the file is correct.<br/>
➢ The application must have a thread-safe Singleton. When creating it, it is forbidden to use **enum**.<br/>
➢ Use **Log4J2** to write logs.<br/>
➢ To display the work of threads, use the main method.<br/>

## Индивидуальные задания. Individual tasks.


Порт. <br/>
Корабли заходят в порт для разгрузки и/или загрузки контейнеров и швартуются к причалам. У каждого причала может стоять только один корабль. Контейнеры перегружаются<br/> с корабля на склад порта и\или со склада на корабль. Число контейнеров не может превышать емкость склада или корабля. Каждый корабль обязательно должен быть обслужен.<br/>

Port.<br/>
Ships enter the port to unload and/or load containers and moor to the berths. Each berth can only have one ship. Containers are reloaded from the ship to the port<br/>
warehouse and / or from the warehouse to the ship. The number of containers cannot exceed the capacity of the warehouse or ship. Each ship must be serviced.<br/>



