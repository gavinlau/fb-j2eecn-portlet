<%@ include file="/html/init.jsp" %>
<%@page import="com.j2eecn.fb.service.FeedBackLocalServiceUtil"%>

<portlet:renderURL var="addRenderURL">
	<portlet:param name="mvcPath" value="/html/feedback/add.jsp" />
</portlet:renderURL>
<portlet:renderURL var="backRenderURL">
	<portlet:param name="mvcPath" value="/html/feedback/view.jsp" />
</portlet:renderURL>

<aui:form name="fbSearchForm" method="post" action="${backRenderURL }">
	<div class="fb-list">
		<liferay-ui:search-container var="searchContainer"
			emptyResultsMessage="no-entries-were-found">
			<aui:nav-bar>
				<aui:nav>
					<aui:nav-item href="${addRenderURL }" label="fb-add"
						iconCssClass="icon-folder-close" />
				</aui:nav>
			</aui:nav-bar>
			<liferay-ui:search-container-results>
				<%
				total=FeedBackLocalServiceUtil.getFeedBacksCount();
				results=FeedBackLocalServiceUtil.getFeedBacks(searchContainer.getStart(), searchContainer.getEnd());
				pageContext.setAttribute("results", results);
				pageContext.setAttribute("total", total);
				%>
			</liferay-ui:search-container-results>
			<liferay-ui:search-container-row className="com.j2eecn.fb.model.FeedBack" keyProperty="fbId" modelVar="entry">
				<liferay-ui:search-container-column-text property="rpName" name="fb-userName"/>
			</liferay-ui:search-container-row>
			<liferay-ui:search-iterator />
		</liferay-ui:search-container>
	</div>
</aui:form>
