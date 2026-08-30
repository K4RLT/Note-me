package com.google.android.gms.internal.mlkit_vision_digital_ink;

import com.facebook.ads.AdError;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;

/* loaded from: classes.dex */
public enum vq {
    /* JADX INFO: Fake field, exist only in values array */
    UNABLE_SHARE_FILE_AFTER_DOWNLOAD_ERROR(0),
    /* JADX INFO: Fake field, exist only in values array */
    SUCCESS(1),
    UNKNOWN_ERROR(2),
    ANDROID_DOWNLOADER_UNKNOWN(100),
    ANDROID_DOWNLOADER_CANCELED(FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS),
    ANDROID_DOWNLOADER_INVALID_REQUEST(FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH),
    ANDROID_DOWNLOADER_HTTP_ERROR(FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT),
    ANDROID_DOWNLOADER_REQUEST_ERROR(FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION),
    ANDROID_DOWNLOADER_RESPONSE_OPEN_ERROR(FacebookMediationAdapter.ERROR_REQUIRES_UNIFIED_NATIVE_ADS),
    ANDROID_DOWNLOADER_RESPONSE_CLOSE_ERROR(FacebookMediationAdapter.ERROR_WRONG_NATIVE_TYPE),
    ANDROID_DOWNLOADER_NETWORK_IO_ERROR(FacebookMediationAdapter.ERROR_NULL_CONTEXT),
    ANDROID_DOWNLOADER_DISK_IO_ERROR(FacebookMediationAdapter.ERROR_MAPPING_NATIVE_ASSETS),
    ANDROID_DOWNLOADER_FILE_SYSTEM_ERROR(FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD),
    ANDROID_DOWNLOADER_UNKNOWN_IO_ERROR(FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD),
    /* JADX INFO: Fake field, exist only in values array */
    ANDROID_DOWNLOADER_OAUTH_ERROR(FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION),
    /* JADX INFO: Fake field, exist only in values array */
    UNABLE_TO_RESERVE_FILE_ENTRY(200),
    GROUP_NOT_FOUND_ERROR(300),
    /* JADX INFO: Fake field, exist only in values array */
    UNABLE_TO_RESERVE_FILE_ENTRY(301),
    INSECURE_URL_ERROR(302),
    LOW_DISK_ERROR(303),
    /* JADX INFO: Fake field, exist only in values array */
    UNABLE_SHARE_FILE_AFTER_DOWNLOAD_ERROR(331),
    UNABLE_TO_CREATE_FILE_URI_ERROR(304),
    SHARED_FILE_NOT_FOUND_ERROR(305),
    MALFORMED_FILE_URI_ERROR(306),
    UNABLE_TO_CREATE_MOBSTORE_RESPONSE_WRITER_ERROR(307),
    UNABLE_TO_VALIDATE_DOWNLOAD_FILE_ERROR(308),
    DOWNLOADED_FILE_NOT_FOUND_ERROR(309),
    DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR(310),
    CUSTOM_FILEGROUP_VALIDATION_FAILED(330),
    UNABLE_TO_SERIALIZE_DOWNLOAD_TRANSFORM_ERROR(311),
    DOWNLOAD_TRANSFORM_IO_ERROR(312),
    FINAL_FILE_CHECKSUM_MISMATCH_ERROR(313),
    DELTA_DOWNLOAD_BASE_FILE_NOT_FOUND_ERROR(314),
    DELTA_DOWNLOAD_DECODE_IO_ERROR(315),
    UNABLE_TO_UPDATE_FILE_STATE_ERROR(316),
    UNABLE_TO_UPDATE_GROUP_METADATA_ERROR(317),
    /* JADX INFO: Fake field, exist only in values array */
    UNABLE_SHARE_FILE_AFTER_DOWNLOAD_ERROR(318),
    /* JADX INFO: Fake field, exist only in values array */
    UNABLE_TO_RESERVE_FILE_ENTRY(319),
    /* JADX INFO: Fake field, exist only in values array */
    UNABLE_SHARE_FILE_AFTER_DOWNLOAD_ERROR(320),
    UNABLE_TO_REMOVE_SYMLINK_STRUCTURE(321),
    UNABLE_TO_CREATE_SYMLINK_STRUCTURE(322),
    /* JADX INFO: Fake field, exist only in values array */
    UNABLE_TO_RESERVE_FILE_ENTRY(323),
    INVALID_INLINE_FILE_URL_SCHEME(324),
    /* JADX INFO: Fake field, exist only in values array */
    INLINE_FILE_IO_ERROR(327),
    /* JADX INFO: Fake field, exist only in values array */
    MISSING_INLINE_DOWNLOAD_PARAMS(328),
    /* JADX INFO: Fake field, exist only in values array */
    MISSING_INLINE_FILE_SOURCE(329),
    /* JADX INFO: Fake field, exist only in values array */
    MALFORMED_DOWNLOAD_URL(325),
    /* JADX INFO: Fake field, exist only in values array */
    UNSUPPORTED_DOWNLOAD_URL_SCHEME(326),
    /* JADX INFO: Fake field, exist only in values array */
    MANIFEST_FILE_GROUP_POPULATOR_INVALID_FLAG_ERROR(400),
    /* JADX INFO: Fake field, exist only in values array */
    MANIFEST_FILE_GROUP_POPULATOR_CONTENT_CHANGED_DURING_DOWNLOAD_ERROR(401),
    /* JADX INFO: Fake field, exist only in values array */
    MANIFEST_FILE_GROUP_POPULATOR_PARSE_MANIFEST_FILE_ERROR(402),
    /* JADX INFO: Fake field, exist only in values array */
    MANIFEST_FILE_GROUP_POPULATOR_DELETE_MANIFEST_FILE_ERROR(403),
    /* JADX INFO: Fake field, exist only in values array */
    MANIFEST_FILE_GROUP_POPULATOR_METADATA_IO_ERROR(404),
    /* JADX INFO: Fake field, exist only in values array */
    EMBEDDED_ASSET_MANIFEST_POPULATOR_PARSE_MANIFEST_FILE_ERROR(500),
    /* JADX INFO: Fake field, exist only in values array */
    EMBEDDED_ASSET_MANIFEST_POPULATOR_REWRITE_DOWNLOAD_URLS_ERROR(501),
    /* JADX INFO: Fake field, exist only in values array */
    EMBEDDED_ASSET_MANIFEST_POPULATOR_FETCH_ACCOUNTS_ERROR(502),
    /* JADX INFO: Fake field, exist only in values array */
    EMBEDDED_ASSET_MANIFEST_POPULATOR_OVERRIDER_FAILURE_ERROR(503),
    /* JADX INFO: Fake field, exist only in values array */
    EMBEDDED_ASSET_MANIFEST_POPULATOR_FAIL_TO_ADD_GROUP_ERROR(504),
    /* JADX INFO: Fake field, exist only in values array */
    EMBEDDED_ASSET_MANIFEST_POPULATOR_FAIL_TO_IMPORT_GROUP_ERROR(505),
    /* JADX INFO: Fake field, exist only in values array */
    EMBEDDED_ASSET_MANIFEST_POPULATOR_MANIFEST_CONFIG_HELPER_ERROR(506),
    /* JADX INFO: Fake field, exist only in values array */
    HADES_FAIL_TO_DOWNLOAD_MANIFEST(4000),
    /* JADX INFO: Fake field, exist only in values array */
    HADES_FAIL_TO_DOWNLOAD_MANIFEST_CANCELED(4001),
    /* JADX INFO: Fake field, exist only in values array */
    HADES_FAIL_TO_DOWNLOAD_MANIFEST_NOT_FOUND(4002),
    /* JADX INFO: Fake field, exist only in values array */
    HADES_FAIL_TO_DOWNLOAD_MANIFEST_PERMISSION_DENIED(4003),
    /* JADX INFO: Fake field, exist only in values array */
    HADES_FAIL_TO_DOWNLOAD_MANIFEST_UNAVAILABLE(4004),
    /* JADX INFO: Fake field, exist only in values array */
    GDD_INVALID_ACCOUNT(AdError.SERVER_ERROR_CODE),
    /* JADX INFO: Fake field, exist only in values array */
    GDD_INVALID_AUTH_TOKEN(AdError.INTERNAL_ERROR_CODE),
    /* JADX INFO: Fake field, exist only in values array */
    GDD_FAIL_IN_SYNC_RUNNER(AdError.CACHE_ERROR_CODE),
    /* JADX INFO: Fake field, exist only in values array */
    GDD_INVALID_ELEMENT_COMBINATION_RECEIVED(AdError.INTERNAL_ERROR_2003),
    /* JADX INFO: Fake field, exist only in values array */
    GDD_INVALID_INLINE_PAYLOAD_ELEMENT_DATA(AdError.INTERNAL_ERROR_2004),
    /* JADX INFO: Fake field, exist only in values array */
    GDD_INVALID_CURRENT_ACTIVE_ELEMENT_DATA(2005),
    /* JADX INFO: Fake field, exist only in values array */
    GDD_INVALID_NEXT_PENDING_ELEMENT_DATA(AdError.INTERNAL_ERROR_2006),
    /* JADX INFO: Fake field, exist only in values array */
    GDD_CURRENT_ACTIVE_GROUP_HAS_NO_INLINE_FILE(2007),
    /* JADX INFO: Fake field, exist only in values array */
    GDD_FAIL_TO_ADD_NEXT_PENDING_GROUP(AdError.REMOTE_ADS_SERVICE_ERROR),
    /* JADX INFO: Fake field, exist only in values array */
    GDD_MISSING_ACCOUNT_FOR_PRIVATE_SYNC(AdError.INTERSTITIAL_AD_TIMEOUT),
    /* JADX INFO: Fake field, exist only in values array */
    GDD_FAIL_IN_SYNC_RUNNER_PUBLIC(2010),
    /* JADX INFO: Fake field, exist only in values array */
    GDD_FAIL_IN_SYNC_RUNNER_PRIVATE(2011),
    /* JADX INFO: Fake field, exist only in values array */
    GDD_PUBLIC_SYNC_SUCCESS(2012),
    /* JADX INFO: Fake field, exist only in values array */
    GDD_PRIVATE_SYNC_SUCCESS(2013),
    /* JADX INFO: Fake field, exist only in values array */
    GDD_FAIL_TO_RETRIEVE_ZWIEBACK_TOKEN(2014),
    /* JADX INFO: Fake field, exist only in values array */
    PCDD_GENERIC_FAILURE(4100),
    /* JADX INFO: Fake field, exist only in values array */
    PCDD_FAIL_IN_OAK_CLIENT(4101),
    /* JADX INFO: Fake field, exist only in values array */
    PCDD_FAIL_IN_OAK_REQUEST(4102),
    /* JADX INFO: Fake field, exist only in values array */
    PCDD_RESULT_ILLEGAL_ARGUMENT(4103),
    /* JADX INFO: Fake field, exist only in values array */
    PCDD_RESULT_INVALID_DATA(4104),
    /* JADX INFO: Fake field, exist only in values array */
    PCDD_RESULT_NOT_FOUND(4105),
    /* JADX INFO: Fake field, exist only in values array */
    PCDD_FAIL_TO_ADD_GROUP(4106);


    /* renamed from: u, reason: collision with root package name */
    public final int f15147u;

    vq(int i) {
        this.f15147u = i;
    }
}
