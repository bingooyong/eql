package org.n3r.eql.config;

import org.n3r.eql.base.EqlResourceLoader;
import org.n3r.eql.base.ExpressionEvaluator;

public interface EqlConfigDecorator extends EqlConfig {
    EqlResourceLoader getSqlResourceLoader();

    ExpressionEvaluator getExpressionEvaluator();
}
