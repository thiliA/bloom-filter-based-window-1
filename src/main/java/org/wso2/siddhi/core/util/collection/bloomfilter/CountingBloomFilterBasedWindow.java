package org.wso2.siddhi.core.util.collection.bloomfilter;

import java.util.List;
import java.util.Queue;

import org.apache.log4j.Logger;
import org.wso2.siddhi.core.event.ComplexEvent;
import org.wso2.siddhi.core.util.collection.SiddhiWindow;
import org.wso2.siddhi.query.api.expression.Expression;

public class CountingBloomFilterBasedWindow implements SiddhiWindow {

	protected int windowSize;
	protected int windowFilterAttributeId;
	protected double filterValue;

	protected Queue<ComplexEvent> eventQueue;
	
	private static final Logger LOGGER = Logger
			.getLogger(CountingBloomFilterBasedWindow.class);

	public void init(Expression[] expressions) {
		
		if (expressions.length != 2) {
			LOGGER.error("Parameters count is not matching, There should be two parameters ");
		}
		variable = ((Variable) expressions[0]).getAttributeName();
		noValue = ((IntConstant) expressions[1]).getValue();
		uniqueWindow = new LinkedHashMap<Object, InEvent>();
		variablePosition = abstractDefinition.getAttributePosition(variable);

	}

	public void add(ComplexEvent event) {
		// TODO Auto-generated method stub

	}

	public ComplexEvent getLast(Boolean remove) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ComplexEvent> find(String attributeName, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	public void remove(ComplexEvent event) {
		// TODO Auto-generated method stub

	}

	public Object[] currentState() {
		// TODO Auto-generated method stub
		return null;
	}

	public void restoreState(Object[] objects) {
		// TODO Auto-generated method stub

	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void destroy() {
		// TODO Auto-generated method stub

	}

}
