package com.javasampleapproach.springrest.cassandra.repo;

import java.util.*;

import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

import com.javasampleapproach.springrest.cassandra.model.Provider;
public interface ProviderRepository extends CassandraRepository<Provider, UUID> {
}
