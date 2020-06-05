package com.bbubbush.demo.logic.repositories.impl;

import com.bbubbush.demo.logic.repositories.DemoRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository @Primary
public class DemoRepositoryUsedH2 implements DemoRepository {
}
