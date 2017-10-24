package datawave.webservice.query.exception;

/**
 * Enum to define error codes for the web service
 *
 *
 */
public enum DatawaveErrorCode {
    // 500 Internal Server Error
    UNKNOWN_SERVER_ERROR(500, 1, "Unknown server error."),
    QUERY_DUPLICATION_ERROR(500, 2, "Error duplicating query."),
    QUERY_UPDATE_ERROR(500, 3, "Error updating query."),
    QUERY_TRANSFORM_ERROR(500, 4, "Could not transform query."),
    QUERY_AUDITING_ERROR(500, 5, "Error auditing query."),
    QUERY_LISTING_ERROR(500, 6, "Error listing queries for user."),
    RUNNING_QUERY_CACHE_ERROR(500, 7, "Could not cache running query."),
    DEPERSIST_ERROR(500, 8, "Could not de-persist query."),
    QUERY_LOCKED_ERROR(500, 9, "Query locked, probably in use."),
    QUERY_RESET_ERROR(500, 10, "Could not reset query."),
    QUERY_TRANSACTION_ERROR(500, 11, "Error committing transaction."),
    QUERY_CACHE_PURGE_ERROR(500, 12, "Error clearing query cache."),
    UNSUPPORTED_MEDIA_TYPE(500, 13, "No supported media types in accept header."),
    QUERY_NEXT_ERROR(500, 14, "Error calling next for query."),
    CLOSE_ERROR(500, 15, "Error closing query."),
    CANCELLATION_ERROR(500, 16, "Error cancelling query."),
    JOB_STARTING_ERROR(500, 17, "Error starting job."),
    QUERY_GET_ERROR(500, 18, "Error getting query."),
    LIST_ERROR(500, 19, "Error in list."),
    QUERY_REMOVAL_ERROR(500, 20, "Error removing query."),
    BAD_RESPONSE_CLASS(500, 21, "Response class does not implement Protostuff Message interface."),
    INVALID_FORMAT(500, 22, "Invalid format."),
    JAXB_CONTEXT_ERROR(500, 23, "Error creating JAX-B context for class."),
    CONNECTION_RETURN_ERROR(500, 24, "Error returning Accumulo connection on failed create."),
    AUDITING_ERROR(500, 25, "Error Auditing."),
    SERVER_SHUTDOWN(500, 26, "Server being shut down."),
    QUERY_TIMEOUT(500, 27, "Query timed out."),
    UNEXPECTED_PRINCIPAL_ERROR(500, 28, "Principal is not the correct type."),
    CACHED_RESULTS_TABLE_CREATE_ERROR(500, 29, "Error creating results table."),
    CACHE_TABLE_MISSING(500, 30, "CachedResults table missing."),
    CACHE_PERSISTANCE_ERROR(500, 31, "Error persisting status to CachedResults store."),
    CACHED_RESULTS_LOAD_ERROR(500, 32, "Could not load cached results."),
    FAILURE_CLEANUP_ERROR(500, 33, "Error cleaning up from failure."),
    QUERY_CLOSE_ERROR(500, 34, "Error closing query object."),
    FULL_SCAN_DISABLED(500, 35, "Optimized query was empty or failed.  Query Results may still exist, but FULL TABLE SCANS have been disabled."),
    CACHED_QUERY_SQL_ERROR(500, 36, "SQL Error encountered, be sure to call close()."),
    CACHED_QUERY_DESCRIPTION_ERROR(500, 37, "Could not describe."),
    CACHED_QUERY_PERSISTANCE_ERROR(500, 38, "Error persisting query."),
    CACHED_QUERY_SET_ERROR(500, 39, "Error setting query."),
    CACHED_QUERY_UPDATE_ERROR(500, 40, "Error performing update."),
    PREVIOUS_CALL_ERROR(500, 41, "Error calling previous, be sure to call close()."),
    FULL_SCAN_IMPOSSIBLE(500, 42, "Full Table scan query contains Unevaluated/IndexOnly fields.  Cannot run this query."),
    RESET_CALL_ERROR(500, 43, "Could not reset."),
    NEXT_CALL_ERROR(500, 44, "Error calling next, be sure to call close()."),
    METRICS_ERROR(500, 45, "Error getting metrics"),
    CACHED_QUERY_GET_ROWS_ERROR(500, 46, "Error calling getRows(), be sure to call close()"),
    CACHED_QUERY_TRANSACTION_ERROR(500, 47, "Error starting transaction."),
    FILE_LIST_ERROR(500, 48, "Error retrieving file list."),
    CONNECTOR_RETURN_ERROR(500, 49, "Error returning Accumulo connector to connection pool."),
    ACCUMULO_AUTHS_ERROR(500, 50, "Unable to retrieve Accumulo user authorizations."),
    NO_RANGES(500, 51, "No scan ranges produced for query."),
    LOGIC_CONFIGURATION_ERROR(500, 52, "Error configuring logic."),
    INPUT_FORMAT_CLASS_ERROR(500, 53, "Error getting input format class."),
    INVALID_INPUT_FORMAT(500, 54, "Invalid input format."),
    MAPREDUCE_JOB_START_ERROR(500, 55, "Error starting MapReduce job."),
    MAPREDUCE_STATE_PERSISTENCE_ERROR(500, 56, "Error persisting state, killing the job."),
    MAPREDUCE_JOB_KILL_ERROR(500, 57, "Error killing MapReduce job."),
    ENTRY_RETRIEVAL_ERROR(500, 58, "Error getting entry."),
    MAPRED_RESULTS_DELETE_ERROR(500, 59, "Error trying to delete results directory."),
    JOBTRACKER_CONNECTION_ERROR(500, 60, "Error connecting to JobTracker."),
    DFS_DIRECTORY_LISTING_ERROR(500, 61, "Error listing files in result directory."),
    BULK_RESULTS_ENTRY_ERROR(500, 62, "Error creating bulk results entry."),
    JOB_ID_LOOKUP_ERROR(500, 63, "Error searching job index for job id."),
    JOB_STATE_UPDATE_ERROR(500, 64, "Error updating job state for job."),
    RESPONSE_POPULATION_ERROR(500, 65, "Error populating response object."),
    QUERY_SETUP_ERROR(500, 66, "Error setting up query."),
    DFS_DIRECTORY_CREATE_ERROR(500, 67, "Error creating HDFS Directory."),
    DFS_DIRECTORY_READ_ERROR(500, 68, "Unable to read server lib directory."),
    MAPRED_UPDATE_STATUS_ERROR(500, 69, "Error processing MapReduce update status call."),
    MAPRED_LOGOUT_ERROR(500, 70, "Error logging out for processing MapReduce update status call."),
    MODIFICATION_ERROR(500, 71, "Error encountered during modification."),
    MODEL_NAME_LIST_ERROR(500, 72, "Could not list model names."),
    MODEL_FETCH_ERROR(500, 73, "Could not get model."),
    INSERT_MAPPING_ERROR(500, 74, "Could not insert mapping."),
    WRITER_CLOSE_ERROR(500, 75, "Error closing writer."),
    MAPPING_DELETION_ERROR(500, 76, "Could not delete mapping."),
    COLLECTION_ERROR(500, 77, "Error getting collection names."),
    FEED_GET_ERROR(500, 78, "Error getting feed for collection."),
    METADATA_ACCESS_ERROR(500, 79, "Unable to access metadata."),
    EMPTY_QUERY_STRING_AFTER_MODIFICATION(500, 80, "Query string after query modification was empty.  Cannot run query."),
    INDEX_ONLY_FIELDS_RETRIEVAL_ERROR(500, 81, "Could not retrieve index-only fields."),
    CONTENT_FIELDS_RETRIEVAL_ERROR(500, 82, "Could not retrieve content fields."),
    COMPOSITES_RETRIEVAL_ERROR(500, 83, "Could not retrieve composites."),
    TERM_FREQUENCY_FIELDS_RETRIEVAL_ERROR(500, 84, "Could not retrieve term frequency fields."),
    UNPARSEABLE_HDFS_SITE_CONFIG_URL(500, 85, "Cannot parse hdfs site config url."),
    UNPARSEABLE_HDFS_QUERY_CACHE_URI(500, 86, "Cannot parse hdfs query cache uri."),
    FILESYSTEM_CREATE_ERROR(500, 87, "Cannot create FileSystem."),
    FIELD_FETCH_ERROR(500, 88, "Could not fetch fields for specified datatype."),
    QUERY_MODEL_FETCH_ERROR(500, 89, "Could not fetch QueryModel."),
    TYPE_MAPPING_CONFIG_ERROR(500, 90, "Could not configure type mappings."),
    INDEXED_AND_NORMALIZED_FIELDS_CONFIG_ERROR(500, 91, "Could not configure indexed and normalized fields."),
    INDEXED_FIELDS_MISSING(500, 92, "Index lookup found no results or unindexed fields prevented execution of this query."),
    UNEXPECTED_SOURCE_NODE(500, 93, "Unexpected source node."),
    MULTIPLE_RANGES_IN_EXPRESSION(500, 94, "Found multiple ranges in expression."),
    UNPARSEABLE_URI_PARAMETER(500, 95, "Could not parse URI parameter."),
    METADATA_TABLE_FETCH_ERROR(500, 96, "Couldn't get the metadata table!"),
    METADATA_TABLE_RECORD_FETCH_ERROR(500, 97, "Couldn't fetch records from the metadata table!"),
    APPLY_FUNCTION_ERROR(500, 98, "Couldn't apply function."),
    ASTNUMBERLITERAL_TYPE_ASCERTAIN_ERROR(500, 99, "Could not ascertain type of ASTNumberLiteral."),
    DATATYPESFORINDEXFIELDS_MULTIMAP_MISSING(500, 100, "Configuration option did not contain dataTypesForIndexedFields multimap."),
    NODE_PROCESSING_ERROR(500, 101, "Could not process node."),
    ASSIGNMENT_NODE_PROCESSING_ERROR(500, 102, "Could not process assignment node."),
    GT_NODE_PROCESSING_ERROR(500, 103, "Could not process greater-than node."),
    LT_NODE_PROCESSING_ERROR(500, 104, "Could not process less-than node."),
    GTE_NODE_PROCESSING_ERROR(500, 105, "Could not process greater-than-or-equal node."),
    LTE_NODE_PROCESSING_ERROR(500, 106, "Could not process less-than-or-equal node."),
    FUNCTION_NODE_PROCESSING_ERROR(500, 107, "Could not process function node."),
    EQUALS_REGEX_NODE_PROCESSING_ERROR(500, 108, "Could not process equals-regex node."),
    NOT_EQUALS_REGEX_NODE_PROCESSING_ERROR(500, 109, "Could not process not-equals-regex node."),
    FULL_TABLE_SCAN_DISALLOWED(500, 110, "Full-table scans are disallowed by the IndexQueryPlanner"),
    INDETERMINATE_INDEX_STATUS(500, 111, "Could not determine index status of query terms."),
    EMPTY_RANGE_STREAM(500, 112, "Found an empty range stream."),
    MORE_THAN_ONE_CHILD(500, 113, "More than one child."),
    EXPAND_QUERY_TERM_SYSTEM_LIMITS(500, 114, "Could not expand query term due to configured system limits. Contact system administrators for more details"),
    PRIMARY_RANGE_CREATE_ERROR(500, 115, "Could not create primary range."),
    HAS_NEXT_ELEMENT_ERROR(500, 116, "Could not determine if the iteration has more elements."),
    SEEK_NEXT_ELEMENT_ERROR(500, 117, "Could not seek to next element in iteration."),
    FETCH_NEXT_ELEMENT_ERROR(500, 118, "Could not get next element in iteration."),
    FETCH_FIRST_ELEMENT_ERROR(500, 119, "Could not get first element."),
    FETCH_LAST_ELEMENT_ERROR(500, 120, "Could not get last element."),
    NODE_LITERAL_TYPE_ASCERTAIN_ERROR(500, 121, "Could not ascertain literal type of node."),
    BUILD_REVERSE_FIELDS_ERROR(500, 122, "Could not build reverse fields."),
    QUERY_EXECUTION_ERROR(500, 123, "Something went wrong running your query."),
    NODE_EXPANSION_ERROR(500, 124, "Could not expand node."),
    FIELD_NAME_EXPANSION_ERROR(500, 125, "Could not expand field names."),
    METHOD_COMPOSITION_ERROR(500, 126, "Cannot compose method."),
    FST_CREATE_ERROR(500, 128, "Cannot create FST for large or list"),
    NODE_WRONG_NUMBER_OF_CHILDREN(500, 129, "Expected a binary node but found more than two children."),
    BINARY_NODE_TOO_MANY_CHILDREN(500, 130, "Expected a binary node but found more than two children."),
    ASTREFERENCE_TOO_MANY_CHILDREN(500, 131, "ASTReference with more than one child"),
    ASTEQNODE_TOO_MANY_CHILDREN(500, 132, "An ASTEQNode has more than two children"),
    SCANNER_CREATE_ERROR(500, 133, "Could not create scanner."),
    FUTURE_FETCH_ERROR(500, 134, "Could not get future."),
    CONCURRENT_EXECUTION_ERROR(500, 135, "Could not perform concurrent execution."),
    RANGE_CALCULATION_ERROR(500, 136, "Could not calculate range."),
    RANGECALCULATOR_RESULT_NULL(500, 137, "RangeCalculator.getResult is null."),
    RANGE_CREATE_ERROR(500, 138, "Could not create a range."),
    DATA_INVALID_ERROR(500, 139, "Data was not long enough to contain a valid header."),
    BUFFER_READ_ERROR(500, 140, "Could not read from buffer."),
    INVALID_BYTE(500, 141, "Invalid byte."),
    GZIP_STREAM_WRITE_ERROR(500, 142, "Could not write to GZIP stream."),
    NO_TERMS_REMAIN_AFTER_OPTIMIZE_REMOVAL(500, 143, "No query terms left after removing terms to attempt an optimized query."),
    NO_TERMS_REMAIN_AFTER_NONEXISTENT_REMOVAL(500, 144, "No query terms left after removing non-existent terms."),
    EMPTY_QUERY_AFTER_FUNCTION_NODE_REMOVAL(500, 145, "Empty query after removing function nodes"),
    EMPTY_QUERY_AFTER_NEGATION_REMOVAL(500, 146, "Empty query after removing negations from or expression"),
    EMPTY_QUERY_AFTER_NULL_VALUE_NODE_REMOVAL(500, 147, "Empty query after removing null value nodes"),
    EMPTY_QUERY_AFTER_POST_INDEX_REGEX_REMOVAL(500, 148, "Empty query after removing post-index only regex expressions"),
    AND_EXPRESSION_WIHOUT_NON_NEGATED_CHILDREN(500, 149, "Invalid query: and expression found without and non-negated children"),
    DESERIALIZER_CREATE_ERROR(500, 150, "Cannot create a deserializer"),
    PREVIOUS_ACQUISITION_DATE_EXTRACTION_ERROR(500, 151, "Exception extracting acquisition date from previous event, unable to get end date"),
    NEXT_ACQUISITION_DATE_EXTRACTION_ERROR(500, 152, "Exception extracting acquisition date from next event, unable to get end date"),
    ACQUISITION_DATE_EXTRACTION_ERROR(500, 153, "Exception extracting acquisition date from event, unable to get begin date"),
    HDFS_CONFIG_URLS_LOAD_ERROR(500, 154, "Unable to load HDFS configuration URLs"),
    HDFS_FILESYSTEM_CREATE_ERROR(500, 155, "Unable to create HDFS file system"),
    HDFS_CACHE_BASE_URI_INVALID(500, 156, "Invalid HDFS cache base URI"),
    HDFS_PATH_CREATE_ERROR(500, 157, "Unable to create path in HDFS"),
    COMPOSITE_METADATA_CONFIG_ERROR(500, 158, "Could not configure composite metadata."),
    DOCUMENT_EVALUATION_ERROR(500, 159, "Could not evaluate document"),
    OOZIE_JOB_START_ERROR(500, 160, "Error starting Oozie job."),
    // 204 No Content
    NO_QUERIES_FOUND(204, 1, "No queries found for user."),
    RESULTS_NOT_SENT(204, 2, "Results not sent."),
    QUERY_CANCELED(204, 3, "Query was canceled."),
    EMPTY_FIELD_MAP(204, 4, "Field map is empty."),
    NO_CONTENT_STATUS(204, 5, "Status indicates no content."),
    // 400 Bad Request
    QUERY_NAME_REQUIRED(400, 1, "Param queryName is required."),
    INVALID_PAGE_SIZE(400, 2, "Invalid page size."),
    INVALID_EXPIRATION_DATE(400, 3, "Invalid expiration date."),
    SECURITY_MARKING_CHECK_ERROR(400, 4, "Could not validate security marking."),
    QUERY_LOGIC_ERROR(400, 5, "Could not get query logic."),
    PAGE_SIZE_TOO_LARGE(400, 6, "Page size is larger than configured max."),
    SECURITY_MARKING_REQUIRED(400, 8, "Query updated, but no security marking supplied."),
    INVALID_REQUEST_CLASS(400, 9, "Request class type is invalid."),
    UNKNOWN_PERSISTENCE_MODE(400, 10, "Unknown persistence mode."),
    QUERY_REGEX_OR_USER_REQUIRED(400, 11, "At least one of queryRegex or user is required."),
    ROW_BEGIN_LESS_THAN_1(400, 12, "rowBegin must be >= 1."),
    ROW_END_LESS_THAN_ROW_BEGIN(400, 13, "rowEnd must be >= rowBegin."),
    TOO_MANY_ROWS_REQUESTED(400, 14, "Requested more rows than allowed."),
    JOB_CONFIGURATION_ERROR(400, 15, "Could not get configuration for job."),
    FIELDS_NOT_IN_DATA_DICTIONARY(400, 16, "The query contained fields which do not exist in the data dictionary for any specified datatype."),
    UNPARSEABLE_JEXL_QUERY(400, 17, "Could not parse JEXL query."),
    INVALID_REGEX(400, 18, "Query contained an invalid regular expression."),
    INDEX_ONLY_FIELDS_MIXED_INVALID_EXPRESSIONS(400, 19,
                    "Query failed because index-only fields are mixed with expressions that cannot be run against the index."),
    TOO_MANY_TERMS(400, 20, "Too many terms in your query."),
    UNKNOWN_COMPRESSION_SCHEME(400, 21, "Unknown compression scheme specified."),
    INVALID_SYNTAX_PARSE_ERROR(400, 22, "Cannot parse due to invalid syntax."),
    INVALID_FUNCTION_ARGUMENTS(400, 23, "Invalid arguments to function."),
    NUMERIC_DISTANCE_ARGUMENT_MISSING(400, 25, "Expected numeric distance argument"),
    FUNCTION_ARGUMENTS_MISSING(400, 26, "No arguments were passed to this function!"),
    TERMOFFSETMAP_AND_TERMS_MISSING(400, 27, "There is no termOffsetMap or terms!"),
    TERMS_MISSING(400, 28, "There are no terms!"),
    JEXLNODEDESCRIPTOR_NAMESPACE_UNEXPECTED(400, 29, "Calling getJexlNodeDescriptor with an unexpected namespace."),
    JEXLNODEDESCRIPTOR_NODE_FOR_FUNCTION(400, 30, "Calling getJexlNodeDescriptor with node for a function."),
    EQUALS_FIELD_NAME_VALUE_MISSING(400, 31, "An == clause must have a field name and a field value supplied."),
    REGEX_EQUALS_FIELD_NAME_VALUE_MISSING(400, 32, "An =~ clause must have a field name and a field value supplied."),
    NOT_EQUALS_FIELD_NAME_VALUE_MISSING(400, 33, "An != clause must have a field name and a field value supplied."),
    REGEX_NOT_EQUALS_FIELD_NAME_VALUE_MISSING(400, 34, "An !~ clause must have a field name and a field value supplied."),
    OR_NODE_FROM_SINGLE_VALUE(400, 35, "Attempting to create an OR node from single value."),
    TIME_WINDOW_TOO_LARGE(400, 36, "The time window between begin and end date is too large"),
    INVALID_PARAMETER_FORMAT(400, 37, "Invalid parameter format."),
    INVALID_DATE(400, 38, "Invalid date."),
    INVALID_NUMBER(400, 39, "Invalid number."),
    MISSING_REQUIRED_PARAMETER(400, 40, "Missing required parameter."),
    INVALID_PAGE_TIMEOUT(400, 41, "Invalid page timeout."),
    // 401 Unauthorized
    QUERY_OWNER_MISMATCH(401, 1, "Current user does not match user that defined query."),
    JOB_EXECUTION_UNAUTHORIZED(401, 2, "User not authorized to run this job."),
    // 404 Not Found
    NO_QUERY_OBJECT_MATCH(404, 1, "No query object matches this id."),
    TOO_MANY_QUERY_OBJECT_MATCHES(404, 2, "More than one query object matches this id."),
    INVALID_QUERY_ID(404, 3, "Invalid query id."),
    NO_QUERY_RESULTS_FOUND(404, 4, "No results found for query."),
    CACHED_RESULT_NOT_FOUND(404, 5, "CachedResult not found."),
    QUERY_OR_VIEW_NOT_FOUND(404, 6, "Query/view not found."),
    VIEW_NOT_FOUND(404, 7, "View not found."),
    NO_MAPREDUCE_OBJECT_MATCH(404, 8, "No MapReduce object matches this id."),
    TOO_MANY_MAPREDUCE_OBJECT_MATCHES(404, 9, "More than one MapReduce object matches this id."),
    FILE_NOT_FOUND(404, 10, "File not found."),
    RESULT_FILE_ACCESS_ERROR(404, 11, "Error accessing result file."),
    JOB_DIRECTORY_NOT_FOUND(404, 12, "Directory not found for job."),
    RESULT_DIRECTORY_ACCESS_ERROR(404, 13, "Error accessing result directory."),
    HDFS_CONNECTION_ERROR(404, 14, "Unable to connect to HDFS."),
    WORKING_DIRECTORY_DELETE_ERROR(404, 15, "Unable to delete working directory."),
    UNFIELDED_QUERY_ZERO_MATCHES(404, 16, "Unfielded query had zero matches in the index, returning no results, query."),
    NO_ANYFIELD_EXPANSION_MATCH(404, 17, "Did not find any matches in index for ANYFIELD expansion."),
    NO_UNFIELDED_TERM_EXPANSION_MATCH(404, 18, "Did not find any matches in index for the expansion of unfielded terms"),
    TABLE_NOT_FOUND(404, 19, "Could not find table."),
    EXPECTED_HEADER_NOT_FOUND(404, 20, "Did not find the expected header"),
    FUNCTION_NOT_FOUND(404, 21, "Function not found."),
    NOT_SPECIFIED(404, 22, "Not specified."),
    JEXL_NODES_MISSING(404, 23, "Missing JexlNodes."),
    IDENTIFIER_MISSING(404, 24, "Could not get identifier."),
    LITERAL_MISSING(404, 25, "Could not get literal."),
    FIELD_NAME_MISSING(404, 26, "Could not get field name."),
    STOPWATCH_MISSING(404, 27, "Stopwatch missing."),
    VALUE_OPERATOR_MISSING(404, 28, "No operator for value."),
    SERVICE_NOT_CONFIGURED(404, 29, "Service is not configured."),
    // 412 Precondition Failed
    CACHED_RESULTS_IMPORT_ERROR(412, 1, "Error trying to import cached results data from another node."),
    CACHED_RESULTS_PERSIST_ERROR(412, 2, "Error trying to persist/retrieve cached results."),
    QUERY_NOT_CACHED(412, 3, "Query not cached.  Try loading query again."),
    QUERY_TIMEOUT_FOR_RESOURCES(412, 4, "The paging of your query timed out to free up resources.  Call reset(id) to reset your query to the beginning."),
    CACHED_RUNNING_QUERY_ERROR(412, 5, "Could not retrieve cached running query."),
    QUERY_TIMEOUT_OR_SERVER_ERROR(412, 6, "Your query timed out, or the server holding it had a problem.  Call reset(id) to start your query over."),
    REQUESTED_PAGE_SIZE_TOO_LARGE(412, 7, "The requested page size is larger than the configured max page size."),
    QUERY_DEPTH_OR_TERM_THRESHOLD_EXCEEDED(412, 8, "Query failed because it exceeded the query depth or term threshold."),
    QUERY_DEPTH_THRESHOLD_EXCEEDED(412, 9, "Query failed because it exceeded the query depth threshold."),
    QUERY_TERM_THRESHOLD_EXCEEDED(412, 10, "Query failed because it exceeded the query term threshold."),
    FULL_TABLE_SCAN_REQUIRED_BUT_DISABLED(412, 11, "Full table scan required but not enabled.  Cannot run query."),
    IGNORE_PATTERN_FOR_INDEX_LOOKUP(412, 12, "Ignoring pattern for index lookup because it is disallowed"),
    WILDCARDS_BOTH_SIDES(412, 13, "Found wildcards on boths sides of a term and full table scan is disabled"),
    EQUALS_NODE_TWO_LITERALS(412, 14, "Cannot process an equals node with two literals."),
    FIELD_NOT_INDEXED(412, 15, "Field name is is not indexed. Query cannot be run as an index query."),
    CURRENT_AND_PREVIOUS_EVENT_ORDER_INVALID(412, 16, "Current event and previous event are not in chronological order"),
    CURRENT_AND_NEXT_EVENT_ORDER_INVALID(412, 17, "Current event and next event are not in chronological order"),
    FIELD_PHRASE_QUERY_NOT_INDEXED(412, 18, "Field cannot be queried as a phrase since it was not indexed as such.");
    
    private String message;
    private int httpCode;
    private int subCode;
    
    DatawaveErrorCode(int httpCode, int subCode, String message) {
        this.httpCode = httpCode;
        this.subCode = subCode;
        this.message = message;
    }
    
    public String getErrorCode() {
        return Integer.toString(httpCode) + "-" + Integer.toString(subCode);
    }
    
    @Override
    public String toString() {
        return message;
    }
    
}
