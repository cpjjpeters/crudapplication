package be.ipeters.crudapplication.mapper;

import be.ipeters.crudapplication.entities.CityJpaEntity;
import be.ipeters.crudapplication.model.City;
import be.ipeters.crudapplication.model.ui.CityRest;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author tersc
 */
@Qualifier("CityRestMapper")
@Mapper(componentModel = "spring")//,unmappedTargetPolicy = ReportingPolicy.WARN)
public interface CityRestMapper {
    CityRest modelToRest(City city);

    City RestToModel(CityRest cityRest);
}
