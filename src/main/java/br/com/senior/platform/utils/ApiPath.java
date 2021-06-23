package br.com.senior.platform.utils;

import lombok.experimental.UtilityClass;

/**
 * Utilitário com os caminhos dos serviços
 */
@UtilityClass
public class ApiPath {

    /**
     * Caminhos do serviço Workflow
     */
    @UtilityClass
    public class Workflow {
        
        public static final String START_PROCESS = "startProcess";
        public static final String FIND_PROCESS = "findProcess";
        public static final String GET_PROCESSES_LIST = "getProcessesList";
        public static final String GET_RANKING_PROCESSES = "getRankingProcesses";
        public static final String GET_PROCESS_INSTANCE = "getProcessInstance";
        public static final String CANCEL_PROCESS_INSTANCE = "cancelProcessInstance";
        public static final String START_REQUEST = "startRequest";
        public static final String NEW_ATTACHMENT = "newAttachment";
        public static final String COMMIT_ATTACHMENT = "commitAttachment";
        public static final String LINK_ATTACHMENTS = "linkAttachments";
        public static final String GET_REQUESTS_RESUME = "getRequestsResume";
        public static final String GET_REQUEST_HISTORY_TIMELINE = "getRequestHistoryTimeline";
        public static final String GET_THIRD_PARTY_REQUEST_BY_STATUS = "getThirdPartyRequestByStatus";
        public static final String SEARCH_TASKS = "searchTasks";
        public static final String GET_SUBJECTS = "getSubjects";
        public static final String GET_NEXT_SUBJECT = "getNextSubject";
        public static final String GET_NEXT_SUBJECT_FROM_INITIAL_TASK = "getNextSubjectFromInitialTask";
        public static final String RESPONSE_PENDENCY = "responsePendency";
        public static final String BATCH_PENDENCIES_RESPONSE = "batchPendenciesResponse";
        public static final String CHANGE_PENDENCY_USER = "changePendencyUser";
        public static final String GET_PENDENCY_PROCESS_ACTIONS = "getPendencyProcessActions";
        public static final String GET_MY_PENDENCIES = "getMyPendencies";
        
    }
}
