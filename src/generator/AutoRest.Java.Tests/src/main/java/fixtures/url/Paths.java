/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.url;

import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import fixtures.url.models.ErrorException;
import fixtures.url.models.UriColor;
import java.io.IOException;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Paths.
 */
public interface Paths {
    /**
     * Get true Boolean value on path.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    void getBooleanTrue() throws ErrorException, IOException;

    /**
     * Get true Boolean value on path.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> getBooleanTrueAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Get true Boolean value on path.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> getBooleanTrueAsync();

    /**
     * Get true Boolean value on path.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> getBooleanTrueAsyncWithServiceResponse();

    /**
     * Get false Boolean value on path.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    void getBooleanFalse() throws ErrorException, IOException;

    /**
     * Get false Boolean value on path.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> getBooleanFalseAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Get false Boolean value on path.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> getBooleanFalseAsync();

    /**
     * Get false Boolean value on path.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> getBooleanFalseAsyncWithServiceResponse();

    /**
     * Get '1000000' integer value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    void getIntOneMillion() throws ErrorException, IOException;

    /**
     * Get '1000000' integer value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> getIntOneMillionAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Get '1000000' integer value.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> getIntOneMillionAsync();

    /**
     * Get '1000000' integer value.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> getIntOneMillionAsyncWithServiceResponse();

    /**
     * Get '-1000000' integer value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    void getIntNegativeOneMillion() throws ErrorException, IOException;

    /**
     * Get '-1000000' integer value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> getIntNegativeOneMillionAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Get '-1000000' integer value.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> getIntNegativeOneMillionAsync();

    /**
     * Get '-1000000' integer value.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> getIntNegativeOneMillionAsyncWithServiceResponse();

    /**
     * Get '10000000000' 64 bit integer value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    void getTenBillion() throws ErrorException, IOException;

    /**
     * Get '10000000000' 64 bit integer value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> getTenBillionAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Get '10000000000' 64 bit integer value.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> getTenBillionAsync();

    /**
     * Get '10000000000' 64 bit integer value.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> getTenBillionAsyncWithServiceResponse();

    /**
     * Get '-10000000000' 64 bit integer value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    void getNegativeTenBillion() throws ErrorException, IOException;

    /**
     * Get '-10000000000' 64 bit integer value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> getNegativeTenBillionAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Get '-10000000000' 64 bit integer value.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> getNegativeTenBillionAsync();

    /**
     * Get '-10000000000' 64 bit integer value.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> getNegativeTenBillionAsyncWithServiceResponse();

    /**
     * Get '1.034E+20' numeric value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    void floatScientificPositive() throws ErrorException, IOException;

    /**
     * Get '1.034E+20' numeric value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> floatScientificPositiveAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Get '1.034E+20' numeric value.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> floatScientificPositiveAsync();

    /**
     * Get '1.034E+20' numeric value.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> floatScientificPositiveAsyncWithServiceResponse();

    /**
     * Get '-1.034E-20' numeric value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    void floatScientificNegative() throws ErrorException, IOException;

    /**
     * Get '-1.034E-20' numeric value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> floatScientificNegativeAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Get '-1.034E-20' numeric value.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> floatScientificNegativeAsync();

    /**
     * Get '-1.034E-20' numeric value.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> floatScientificNegativeAsyncWithServiceResponse();

    /**
     * Get '9999999.999' numeric value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    void doubleDecimalPositive() throws ErrorException, IOException;

    /**
     * Get '9999999.999' numeric value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> doubleDecimalPositiveAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Get '9999999.999' numeric value.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> doubleDecimalPositiveAsync();

    /**
     * Get '9999999.999' numeric value.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> doubleDecimalPositiveAsyncWithServiceResponse();

    /**
     * Get '-9999999.999' numeric value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    void doubleDecimalNegative() throws ErrorException, IOException;

    /**
     * Get '-9999999.999' numeric value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> doubleDecimalNegativeAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Get '-9999999.999' numeric value.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> doubleDecimalNegativeAsync();

    /**
     * Get '-9999999.999' numeric value.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> doubleDecimalNegativeAsyncWithServiceResponse();

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multi-byte string value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    void stringUnicode() throws ErrorException, IOException;

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multi-byte string value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> stringUnicodeAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multi-byte string value.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> stringUnicodeAsync();

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multi-byte string value.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> stringUnicodeAsyncWithServiceResponse();

    /**
     * Get 'begin!*'();:@ &amp;=+$,/?#[]end.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    void stringUrlEncoded() throws ErrorException, IOException;

    /**
     * Get 'begin!*'();:@ &amp;=+$,/?#[]end.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> stringUrlEncodedAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Get 'begin!*'();:@ &amp;=+$,/?#[]end.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> stringUrlEncodedAsync();

    /**
     * Get 'begin!*'();:@ &amp;=+$,/?#[]end.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> stringUrlEncodedAsyncWithServiceResponse();

    /**
     * Get ''.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    void stringEmpty() throws ErrorException, IOException;

    /**
     * Get ''.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> stringEmptyAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Get ''.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> stringEmptyAsync();

    /**
     * Get ''.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> stringEmptyAsyncWithServiceResponse();

    /**
     * Get null (should throw).
     *
     * @param stringPath null string value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    void stringNull(String stringPath) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Get null (should throw).
     *
     * @param stringPath null string value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> stringNullAsync(String stringPath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get null (should throw).
     *
     * @param stringPath null string value
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> stringNullAsync(String stringPath);

    /**
     * Get null (should throw).
     *
     * @param stringPath null string value
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> stringNullAsyncWithServiceResponse(String stringPath);

    /**
     * Get using uri with 'green color' in path parameter.
     *
     * @param enumPath send the value green. Possible values include: 'red color', 'green color', 'blue color'
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    void enumValid(UriColor enumPath) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Get using uri with 'green color' in path parameter.
     *
     * @param enumPath send the value green. Possible values include: 'red color', 'green color', 'blue color'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> enumValidAsync(UriColor enumPath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get using uri with 'green color' in path parameter.
     *
     * @param enumPath send the value green. Possible values include: 'red color', 'green color', 'blue color'
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> enumValidAsync(UriColor enumPath);

    /**
     * Get using uri with 'green color' in path parameter.
     *
     * @param enumPath send the value green. Possible values include: 'red color', 'green color', 'blue color'
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> enumValidAsyncWithServiceResponse(UriColor enumPath);

    /**
     * Get null (should throw on the client before the request is sent on wire).
     *
     * @param enumPath send null should throw. Possible values include: 'red color', 'green color', 'blue color'
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    void enumNull(UriColor enumPath) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Get null (should throw on the client before the request is sent on wire).
     *
     * @param enumPath send null should throw. Possible values include: 'red color', 'green color', 'blue color'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> enumNullAsync(UriColor enumPath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get null (should throw on the client before the request is sent on wire).
     *
     * @param enumPath send null should throw. Possible values include: 'red color', 'green color', 'blue color'
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> enumNullAsync(UriColor enumPath);

    /**
     * Get null (should throw on the client before the request is sent on wire).
     *
     * @param enumPath send null should throw. Possible values include: 'red color', 'green color', 'blue color'
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> enumNullAsyncWithServiceResponse(UriColor enumPath);

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array.
     *
     * @param bytePath '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    void byteMultiByte(byte[] bytePath) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array.
     *
     * @param bytePath '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> byteMultiByteAsync(byte[] bytePath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array.
     *
     * @param bytePath '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> byteMultiByteAsync(byte[] bytePath);

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array.
     *
     * @param bytePath '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> byteMultiByteAsyncWithServiceResponse(byte[] bytePath);

    /**
     * Get '' as byte array.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    void byteEmpty() throws ErrorException, IOException;

    /**
     * Get '' as byte array.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> byteEmptyAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Get '' as byte array.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> byteEmptyAsync();

    /**
     * Get '' as byte array.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> byteEmptyAsyncWithServiceResponse();

    /**
     * Get null as byte array (should throw).
     *
     * @param bytePath null as byte array (should throw)
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    void byteNull(byte[] bytePath) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Get null as byte array (should throw).
     *
     * @param bytePath null as byte array (should throw)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> byteNullAsync(byte[] bytePath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get null as byte array (should throw).
     *
     * @param bytePath null as byte array (should throw)
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> byteNullAsync(byte[] bytePath);

    /**
     * Get null as byte array (should throw).
     *
     * @param bytePath null as byte array (should throw)
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> byteNullAsyncWithServiceResponse(byte[] bytePath);

    /**
     * Get '2012-01-01' as date.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    void dateValid() throws ErrorException, IOException;

    /**
     * Get '2012-01-01' as date.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> dateValidAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Get '2012-01-01' as date.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> dateValidAsync();

    /**
     * Get '2012-01-01' as date.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> dateValidAsyncWithServiceResponse();

    /**
     * Get null as date - this should throw or be unusable on the client side, depending on date representation.
     *
     * @param datePath null as date (should throw)
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    void dateNull(LocalDate datePath) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Get null as date - this should throw or be unusable on the client side, depending on date representation.
     *
     * @param datePath null as date (should throw)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> dateNullAsync(LocalDate datePath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get null as date - this should throw or be unusable on the client side, depending on date representation.
     *
     * @param datePath null as date (should throw)
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> dateNullAsync(LocalDate datePath);

    /**
     * Get null as date - this should throw or be unusable on the client side, depending on date representation.
     *
     * @param datePath null as date (should throw)
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> dateNullAsyncWithServiceResponse(LocalDate datePath);

    /**
     * Get '2012-01-01T01:01:01Z' as date-time.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    void dateTimeValid() throws ErrorException, IOException;

    /**
     * Get '2012-01-01T01:01:01Z' as date-time.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> dateTimeValidAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Get '2012-01-01T01:01:01Z' as date-time.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> dateTimeValidAsync();

    /**
     * Get '2012-01-01T01:01:01Z' as date-time.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> dateTimeValidAsyncWithServiceResponse();

    /**
     * Get null as date-time, should be disallowed or throw depending on representation of date-time.
     *
     * @param dateTimePath null as date-time
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    void dateTimeNull(DateTime dateTimePath) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Get null as date-time, should be disallowed or throw depending on representation of date-time.
     *
     * @param dateTimePath null as date-time
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> dateTimeNullAsync(DateTime dateTimePath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get null as date-time, should be disallowed or throw depending on representation of date-time.
     *
     * @param dateTimePath null as date-time
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> dateTimeNullAsync(DateTime dateTimePath);

    /**
     * Get null as date-time, should be disallowed or throw depending on representation of date-time.
     *
     * @param dateTimePath null as date-time
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> dateTimeNullAsyncWithServiceResponse(DateTime dateTimePath);

    /**
     * Get 'lorem' encoded value as 'bG9yZW0' (base64url).
     *
     * @param base64UrlPath base64url encoded value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    void base64Url(byte[] base64UrlPath) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Get 'lorem' encoded value as 'bG9yZW0' (base64url).
     *
     * @param base64UrlPath base64url encoded value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> base64UrlAsync(byte[] base64UrlPath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get 'lorem' encoded value as 'bG9yZW0' (base64url).
     *
     * @param base64UrlPath base64url encoded value
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> base64UrlAsync(byte[] base64UrlPath);

    /**
     * Get 'lorem' encoded value as 'bG9yZW0' (base64url).
     *
     * @param base64UrlPath base64url encoded value
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> base64UrlAsyncWithServiceResponse(byte[] base64UrlPath);

    /**
     * Get an array of string ['ArrayPath1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the csv-array format.
     *
     * @param arrayPath an array of string ['ArrayPath1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the csv-array format
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    void arrayCsvInPath(List<String> arrayPath) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Get an array of string ['ArrayPath1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the csv-array format.
     *
     * @param arrayPath an array of string ['ArrayPath1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the csv-array format
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> arrayCsvInPathAsync(List<String> arrayPath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get an array of string ['ArrayPath1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the csv-array format.
     *
     * @param arrayPath an array of string ['ArrayPath1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the csv-array format
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> arrayCsvInPathAsync(List<String> arrayPath);

    /**
     * Get an array of string ['ArrayPath1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the csv-array format.
     *
     * @param arrayPath an array of string ['ArrayPath1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the csv-array format
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> arrayCsvInPathAsyncWithServiceResponse(List<String> arrayPath);

    /**
     * Get the date 2016-04-13 encoded value as '1460505600' (Unix time).
     *
     * @param unixTimeUrlPath Unix time encoded value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    void unixTimeUrl(DateTime unixTimeUrlPath) throws ErrorException, IOException;

    /**
     * Get the date 2016-04-13 encoded value as '1460505600' (Unix time).
     *
     * @param unixTimeUrlPath Unix time encoded value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> unixTimeUrlAsync(DateTime unixTimeUrlPath, final ServiceCallback<Void> serviceCallback);

    /**
     * Get the date 2016-04-13 encoded value as '1460505600' (Unix time).
     *
     * @param unixTimeUrlPath Unix time encoded value
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> unixTimeUrlAsync(DateTime unixTimeUrlPath);

    /**
     * Get the date 2016-04-13 encoded value as '1460505600' (Unix time).
     *
     * @param unixTimeUrlPath Unix time encoded value
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> unixTimeUrlAsyncWithServiceResponse(DateTime unixTimeUrlPath);

}
