/*
 * OnfonMediaSMSGatewayLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ke.co.onfonmedia.api.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import org.joda.time.LocalDate;

import ke.co.onfonmedia.api.*;
import ke.co.onfonmedia.api.models.*;
import ke.co.onfonmedia.api.exceptions.*;
import ke.co.onfonmedia.api.http.client.HttpClient;
import ke.co.onfonmedia.api.http.client.HttpContext;
import ke.co.onfonmedia.api.http.request.HttpRequest;
import ke.co.onfonmedia.api.http.response.HttpResponse;
import ke.co.onfonmedia.api.http.response.HttpStringResponse;
import ke.co.onfonmedia.api.http.client.APICallBack;

public class CampaignController extends BaseController {
    //private static variables for the singleton pattern
    private static final Object syncObject = new Object();
    private static CampaignController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the CampaignController class 
     */
    public static CampaignController getInstance() {
        if (null == instance) {
            synchronized (syncObject) {
                if (null == instance) {
                    instance = new CampaignController();
                }
            }
        }
        return instance;
    }

    /**
     * Get Campaign Message Status
     * @param    campaignId    Required parameter: First user have to call Get Campaigns api for CampaignId
     */
    public void getCampaignMessageStatusAsync(
                final int campaignId,
                final APICallBack<DynamicResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildGetCampaignMessageStatusRequest(campaignId);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            DynamicResponse returnValue = _handleGetCampaignMessageStatusResponse(_context);
                            callBack.onSuccess(_context, returnValue);
                        } catch (Exception e) {
                            callBack.onFailure(_context, e);
                        }
                    }

                    public void onFailure(HttpContext _context, Throwable _exception) {
                        // Let the caller know of the failure
                        callBack.onFailure(_context, _exception);
                    }
                });
            }
        };

        // Execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Builds the HttpRequest object for getCampaignMessageStatus
     */
    private HttpRequest _buildGetCampaignMessageStatusRequest(
                final int campaignId) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/Campaign/Statistics");

        //process query parameters
        Map<String, Object> _queryParameters = new HashMap<String, Object>();
        _queryParameters.put("campaignId", campaignId);
        _queryParameters.put("ApiKey", Configuration.apiKey);
        _queryParameters.put("ClientId", Configuration.clientId);
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, _queryParameters);
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>();
        _headers.put("AccessKey", Configuration.accessKey);

        _headers.put("user-agent", BaseController.userAgent);
        _headers.put("accept", "application/json");


        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for getCampaignMessageStatus
     * @return An object of type DynamicResponse
     */
    private DynamicResponse _handleGetCampaignMessageStatusResponse(HttpContext _context)
            throws APIException, IOException {
        HttpResponse _response = _context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnAfterResponse(_context);
        }

        //handle errors defined at the API level
        validateResponse(_response, _context);

        //extract result from the http response
        DynamicResponse _result = new DynamicResponse(_response);

        return _result;
    }

    /**
     * Get Campaigns
     * @param    enddate    Required parameter: Date format must be in yyyy-mm-dd
     * @param    fromdate    Required parameter: Date format must be in yyyy-mm-dd
     * @param    length    Required parameter: Ending index value to fetch the campaign detail.
     * @param    start    Required parameter: Starting index value to fetch the campaign detail.
     */
    public void getCampaignsAsync(
                final LocalDate enddate,
                final LocalDate fromdate,
                final int length,
                final int start,
                final APICallBack<DynamicResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildGetCampaignsRequest(enddate, fromdate, length, start);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            DynamicResponse returnValue = _handleGetCampaignsResponse(_context);
                            callBack.onSuccess(_context, returnValue);
                        } catch (Exception e) {
                            callBack.onFailure(_context, e);
                        }
                    }

                    public void onFailure(HttpContext _context, Throwable _exception) {
                        // Let the caller know of the failure
                        callBack.onFailure(_context, _exception);
                    }
                });
            }
        };

        // Execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Builds the HttpRequest object for getCampaigns
     */
    private HttpRequest _buildGetCampaignsRequest(
                final LocalDate enddate,
                final LocalDate fromdate,
                final int length,
                final int start) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/Campaign");

        //process query parameters
        Map<String, Object> _queryParameters = new HashMap<String, Object>();
        _queryParameters.put("enddate", DateTimeHelper.toSimpleDate(enddate));
        _queryParameters.put("fromdate", DateTimeHelper.toSimpleDate(fromdate));
        _queryParameters.put("length", length);
        _queryParameters.put("start", start);
        _queryParameters.put("ApiKey", Configuration.apiKey);
        _queryParameters.put("ClientId", Configuration.clientId);
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, _queryParameters);
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>();
        _headers.put("AccessKey", Configuration.accessKey);

        _headers.put("user-agent", BaseController.userAgent);
        _headers.put("accept", "application/json");


        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for getCampaigns
     * @return An object of type DynamicResponse
     */
    private DynamicResponse _handleGetCampaignsResponse(HttpContext _context)
            throws APIException, IOException {
        HttpResponse _response = _context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnAfterResponse(_context);
        }

        //handle errors defined at the API level
        validateResponse(_response, _context);

        //extract result from the http response
        DynamicResponse _result = new DynamicResponse(_response);

        return _result;
    }

}
