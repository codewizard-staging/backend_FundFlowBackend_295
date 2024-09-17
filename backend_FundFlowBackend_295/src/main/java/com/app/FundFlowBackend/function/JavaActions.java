package com.app.FundFlowBackend.function;

import com.app.FundFlowBackend.model.Stage;
import com.app.FundFlowBackend.model.Startup;
import com.app.FundFlowBackend.model.FundingRound;
import com.app.FundFlowBackend.model.Founder;
import com.app.FundFlowBackend.model.Document;
import com.app.FundFlowBackend.model.Investor;




import com.app.FundFlowBackend.enums.RoundStatus;
import com.app.FundFlowBackend.enums.StageName;
import com.app.FundFlowBackend.converter.StageNameConverter;
import com.app.FundFlowBackend.converter.RoundStatusConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  