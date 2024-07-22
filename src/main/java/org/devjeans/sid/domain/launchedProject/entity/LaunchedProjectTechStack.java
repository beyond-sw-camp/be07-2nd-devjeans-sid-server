package org.devjeans.sid.domain.launchedProject.entity;


import org.devjeans.sid.domain.common.BaseEntity;
import org.devjeans.sid.domain.siderCard.entity.TechStack;

import javax.persistence.*;

@Entity
public class LaunchedProjectTechStack extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "launched_project_tech_stack")
    private Long id; // LaunchedProject - 기술스택 교차테이블 id

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="launched_project_id")
    private LaunchedProject launchedProject; // Launched-Project 프로젝트 id

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="tech_stack_id")
    private TechStack techStack; //Launched-Project에 사용된 기술스택
}