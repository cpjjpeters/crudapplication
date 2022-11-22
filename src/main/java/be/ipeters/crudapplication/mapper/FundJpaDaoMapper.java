package be.ipeters.crudapplication.mapper;


import be.ipeters.crudapplication.entities.FundJpaEntity;
import be.ipeters.crudapplication.model.Fund;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("FundJpaDaoMapper")
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.WARN)
public interface FundJpaDaoMapper {

    FundJpaEntity modelToJpaEntity(Fund fund);

    Fund jpaEntityToModel(FundJpaEntity fundJpaEntity);
}
