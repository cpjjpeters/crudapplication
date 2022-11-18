package be.ipeters.crudapplication.mapper;

import be.ipeters.crudapplication.entities.CityJpaEntity;
import be.ipeters.crudapplication.model.City;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author tersc
 */
@Qualifier("CityJpaDaoMapper")
@Mapper(componentModel = "spring")//,unmappedTargetPolicy = ReportingPolicy.WARN)
public interface CityJpaDaoMapper {
    CityJpaEntity modelToJpaEntity(City city);

    City jpaEntityToModel(CityJpaEntity cityJpaEntity);
}
