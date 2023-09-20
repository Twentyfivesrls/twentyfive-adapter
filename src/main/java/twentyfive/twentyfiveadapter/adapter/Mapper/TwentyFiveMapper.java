package twentyfive.twentyfiveadapter.adapter.Mapper;

import com.twentyfive.twentyfivemodel.models.linktreeModels.UserLink;
import com.twentyfive.twentyfivemodel.models.ticketModels.AddressBook;
import com.twentyfive.twentyfivemodel.models.ticketModels.Event;
import com.twentyfive.twentyfivemodel.models.ticketModels.Statistic;
import com.twentyfive.twentyfivemodel.models.ticketModels.Ticket;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import twentyfive.twentyfiveadapter.adapter.Document.TicketObjDocumentDB.AddressBookDocumentDB;
import twentyfive.twentyfiveadapter.adapter.Document.TicketObjDocumentDB.EventDocumentDB;
import twentyfive.twentyfiveadapter.adapter.Document.TicketObjDocumentDB.StatisticDocumentDB;
import twentyfive.twentyfiveadapter.adapter.Document.TicketObjDocumentDB.TicketDocumentDB;
import twentyfive.twentyfiveadapter.adapter.Document.UserLinkDocumentDB;

@Mapper
public interface TwentyFiveMapper {
    TwentyFiveMapper INSTANCE = Mappers.getMapper(TwentyFiveMapper.class);

    UserLinkDocumentDB userLinkToUserLinkDocumentDB(UserLink userLink);
    UserLink userLinkDocumentDBToUserLink(UserLinkDocumentDB userLinkDocumentDB);

    AddressBookDocumentDB addressBookToAddressBookDocumentDB(AddressBook addressBook);
    AddressBook addressBookDocumentDBToAddressBook(AddressBookDocumentDB addressBookDocumentDB);

    EventDocumentDB eventToEventDocumentDB(Event event);
    Event eventDocumentDBToEvent(EventDocumentDB eventDocumentDB);

    StatisticDocumentDB statisticToStatisticDocumentDB(Statistic statistic);
    Statistic statisticDocumentDBToStatistic(StatisticDocumentDB statisticDocumentDB);

    TicketDocumentDB ticketToTicketDocumentDB(Ticket ticket);
    Ticket ticketDocumentDBToTicket(TicketDocumentDB ticketDocumentDB);




}
