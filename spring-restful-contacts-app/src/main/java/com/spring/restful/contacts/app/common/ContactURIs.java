package com.spring.restful.contacts.app.common;

public interface ContactURIs {
	String CONCT_API_ROOT = "/contacts";
	String CONCT_API_ROOT_BATCH = CONCT_API_ROOT + "/" + "batch";
	String CONCT_API_URI_BY_ID = CONCT_API_ROOT + "/" + "{id}";
	String GET_CONCT_BY_NAME_ID = CONCT_API_ROOT + "/" + "{name}/{id}";

}
