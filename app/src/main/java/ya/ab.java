package ya;
import ya.t;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;

/* loaded from: classes.dex */
public enum ab implements t {
    NO_ERROR(0),
    /* JADX INFO: Fake field, exist only in values array */
    INCOMPATIBLE_INPUT(1),
    /* JADX INFO: Fake field, exist only in values array */
    INCOMPATIBLE_OUTPUT(2),
    /* JADX INFO: Fake field, exist only in values array */
    INCOMPATIBLE_TFLITE_VERSION(3),
    /* JADX INFO: Fake field, exist only in values array */
    MISSING_OP(4),
    /* JADX INFO: Fake field, exist only in values array */
    DATA_TYPE_ERROR(6),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_TFLITE_MODULE_INIT_ERROR(7),
    /* JADX INFO: Fake field, exist only in values array */
    TFLITE_UNKNOWN_ERROR(8),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIAPIPE_ERROR(9),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_OUT_FETCHING_MODEL_METADATA(5),
    /* JADX INFO: Fake field, exist only in values array */
    MODEL_NOT_DOWNLOADED(100),
    /* JADX INFO: Fake field, exist only in values array */
    URI_EXPIRED(FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS),
    /* JADX INFO: Fake field, exist only in values array */
    NO_NETWORK_CONNECTION(FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH),
    /* JADX INFO: Fake field, exist only in values array */
    METERED_NETWORK(FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT),
    /* JADX INFO: Fake field, exist only in values array */
    DOWNLOAD_FAILED(FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_TFLITE_MODULE_INIT_ERROR(FacebookMediationAdapter.ERROR_REQUIRES_UNIFIED_NATIVE_ADS),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_LIBRARY_LOAD_ERROR(FacebookMediationAdapter.ERROR_WRONG_NATIVE_TYPE),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_TFLITE_MODULE_INIT_ERROR(FacebookMediationAdapter.ERROR_NULL_CONTEXT),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_LIBRARY_LOAD_ERROR(FacebookMediationAdapter.ERROR_MAPPING_NATIVE_ASSETS),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_TFLITE_MODULE_INIT_ERROR(FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_LIBRARY_LOAD_ERROR(FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_TFLITE_MODULE_INIT_ERROR(FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_LIBRARY_LOAD_ERROR(112),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_TFLITE_MODULE_INIT_ERROR(113),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_LIBRARY_LOAD_ERROR(114),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_TFLITE_MODULE_INIT_ERROR(115),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_LIBRARY_LOAD_ERROR(116),
    OPTIONAL_MODULE_NOT_AVAILABLE(201),
    OPTIONAL_MODULE_INIT_ERROR(202),
    OPTIONAL_MODULE_INFERENCE_ERROR(203),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_LIBRARY_LOAD_ERROR(204),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_TFLITE_MODULE_INIT_ERROR(205),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_LIBRARY_LOAD_ERROR(206),
    OPTIONAL_MODULE_CREATE_ERROR(207),
    /* JADX INFO: Fake field, exist only in values array */
    CAMERAX_SOURCE_ERROR(301),
    /* JADX INFO: Fake field, exist only in values array */
    CAMERA1_SOURCE_CANT_START_ERROR(302),
    /* JADX INFO: Fake field, exist only in values array */
    CAMERA1_SOURCE_NO_SUITABLE_SIZE_ERROR(303),
    /* JADX INFO: Fake field, exist only in values array */
    CAMERA1_SOURCE_NO_SUITABLE_FPS_ERROR(304),
    /* JADX INFO: Fake field, exist only in values array */
    CAMERA1_SOURCE_NO_BYTE_SOURCE_FOUND_ERROR(305),
    /* JADX INFO: Fake field, exist only in values array */
    CODE_SCANNER_UNAVAILABLE(400),
    /* JADX INFO: Fake field, exist only in values array */
    CODE_SCANNER_CANCELLED(401),
    /* JADX INFO: Fake field, exist only in values array */
    CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED(402),
    /* JADX INFO: Fake field, exist only in values array */
    CODE_SCANNER_APP_NAME_UNAVAILABLE(403),
    /* JADX INFO: Fake field, exist only in values array */
    CODE_SCANNER_TASK_IN_PROGRESS(404),
    /* JADX INFO: Fake field, exist only in values array */
    CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR(405),
    /* JADX INFO: Fake field, exist only in values array */
    CODE_SCANNER_PIPELINE_INFERENCE_ERROR(406),
    /* JADX INFO: Fake field, exist only in values array */
    CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(407),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE(500),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE(501),
    /* JADX INFO: Fake field, exist only in values array */
    PERMISSION_DENIED(600),
    /* JADX INFO: Fake field, exist only in values array */
    CANCELLED(601),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(602),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(603),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_ERROR(9999);


    /* renamed from: u, reason: collision with root package name */
    public final int f31022u;

    ab(int i) {
        this.f31022u = i;
    }

    @Override // t
    public final int zza() {
        return this.f31022u;
    }
}
