package be.ipeters.crudapplication.services;

import be.ipeters.crudapplication.mapper.FundJpaDaoMapper;
import be.ipeters.crudapplication.model.Fund;
import be.ipeters.crudapplication.persistence.FundPersistenceFacade;
import be.ipeters.crudapplication.repository.FundJpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/* carlpeters created on 21/11/2022 inside the package - be.ipeters.crudapplication.services */
public class FundJpaService implements FundPersistenceFacade {

    private final FundJpaRepository fundJpaRepository;
    private final FundJpaDaoMapper fundJpaDaoMapper;

    public FundJpaService(FundJpaRepository fundJpaRepository, FundJpaDaoMapper fundJpaDaoMapper) {
        this.fundJpaRepository = fundJpaRepository;
        this.fundJpaDaoMapper = fundJpaDaoMapper;
    }

    @Override
    public Fund save(Fund fund) {
        return this.fundJpaDaoMapper.jpaEntityToModel(fundJpaRepository.save(fundJpaDaoMapper.modelToJpaEntity(fund)));
    }

    @Override
    public List<Fund> findAll() {
        return this.fundJpaRepository.findAll()
                .stream()
                .map(fundJpaDaoMapper::jpaEntityToModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Fund> findById(Long id) {
        return this.fundJpaRepository.findById(id)
                .map(fundJpaDaoMapper::jpaEntityToModel);
    }
}
