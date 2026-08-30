package wa;
import g3.a;
import w7.i1;

/* loaded from: classes.dex */
public final class f3 implements zc.d {

    /* renamed from: a, reason: collision with root package name */
    public static final f3 f29615a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final zc.c f29617b = new zc.c("systemInfo", a.p(i1.e(d.class, new a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final zc.c f29619c = new zc.c("eventName", a.p(i1.e(d.class, new a(2))));

    /* renamed from: d, reason: collision with root package name */
    public static final zc.c f29621d = new zc.c("isThickClient", a.p(i1.e(d.class, new a(37))));
    public static final zc.c e = new zc.c("clientType", a.p(i1.e(d.class, new a(61))));

    /* renamed from: f, reason: collision with root package name */
    public static final zc.c f29624f = new zc.c("modelDownloadLogEvent", a.p(i1.e(d.class, new a(3))));

    /* renamed from: g, reason: collision with root package name */
    public static final zc.c f29626g = new zc.c("customModelLoadLogEvent", a.p(i1.e(d.class, new a(20))));

    /* renamed from: h, reason: collision with root package name */
    public static final zc.c f29628h = new zc.c("customModelInferenceLogEvent", a.p(i1.e(d.class, new a(4))));
    public static final zc.c i = new zc.c("customModelCreateLogEvent", a.p(i1.e(d.class, new a(29))));

    /* renamed from: j, reason: collision with root package name */
    public static final zc.c f29631j = new zc.c("onDeviceFaceDetectionLogEvent", a.p(i1.e(d.class, new a(5))));

    /* renamed from: k, reason: collision with root package name */
    public static final zc.c f29633k = new zc.c("onDeviceFaceLoadLogEvent", a.p(i1.e(d.class, new a(59))));

    /* renamed from: l, reason: collision with root package name */
    public static final zc.c f29635l = new zc.c("onDeviceTextDetectionLogEvent", a.p(i1.e(d.class, new a(6))));

    /* renamed from: m, reason: collision with root package name */
    public static final zc.c f29636m = new zc.c("onDeviceTextDetectionLoadLogEvent", a.p(i1.e(d.class, new a(79))));

    /* renamed from: n, reason: collision with root package name */
    public static final zc.c f29637n = new zc.c("onDeviceBarcodeDetectionLogEvent", a.p(i1.e(d.class, new a(7))));

    /* renamed from: o, reason: collision with root package name */
    public static final zc.c f29639o = new zc.c("onDeviceBarcodeLoadLogEvent", a.p(i1.e(d.class, new a(58))));

    /* renamed from: p, reason: collision with root package name */
    public static final zc.c f29641p = new zc.c("onDeviceImageLabelCreateLogEvent", a.p(i1.e(d.class, new a(48))));

    /* renamed from: q, reason: collision with root package name */
    public static final zc.c f29643q = new zc.c("onDeviceImageLabelLoadLogEvent", a.p(i1.e(d.class, new a(49))));

    /* renamed from: r, reason: collision with root package name */
    public static final zc.c f29645r = new zc.c("onDeviceImageLabelDetectionLogEvent", a.p(i1.e(d.class, new a(18))));

    /* renamed from: s, reason: collision with root package name */
    public static final zc.c f29647s = new zc.c("onDeviceObjectCreateLogEvent", a.p(i1.e(d.class, new a(26))));

    /* renamed from: t, reason: collision with root package name */
    public static final zc.c f29649t = new zc.c("onDeviceObjectLoadLogEvent", a.p(i1.e(d.class, new a(27))));

    /* renamed from: u, reason: collision with root package name */
    public static final zc.c f29651u = new zc.c("onDeviceObjectInferenceLogEvent", a.p(i1.e(d.class, new a(28))));

    /* renamed from: v, reason: collision with root package name */
    public static final zc.c f29653v = new zc.c("onDevicePoseDetectionLogEvent", a.p(i1.e(d.class, new a(44))));

    /* renamed from: w, reason: collision with root package name */
    public static final zc.c f29655w = new zc.c("onDeviceSegmentationLogEvent", a.p(i1.e(d.class, new a(45))));

    /* renamed from: x, reason: collision with root package name */
    public static final zc.c f29657x = new zc.c("onDeviceSmartReplyLogEvent", a.p(i1.e(d.class, new a(19))));

    /* renamed from: y, reason: collision with root package name */
    public static final zc.c f29659y = new zc.c("onDeviceLanguageIdentificationLogEvent", a.p(i1.e(d.class, new a(21))));

    /* renamed from: z, reason: collision with root package name */
    public static final zc.c f29661z = new zc.c("onDeviceTranslationLogEvent", a.p(i1.e(d.class, new a(22))));
    public static final zc.c A = new zc.c("cloudFaceDetectionLogEvent", a.p(i1.e(d.class, new a(8))));
    public static final zc.c B = new zc.c("cloudCropHintDetectionLogEvent", a.p(i1.e(d.class, new a(9))));
    public static final zc.c C = new zc.c("cloudDocumentTextDetectionLogEvent", a.p(i1.e(d.class, new a(10))));
    public static final zc.c D = new zc.c("cloudImagePropertiesDetectionLogEvent", a.p(i1.e(d.class, new a(11))));
    public static final zc.c E = new zc.c("cloudImageLabelDetectionLogEvent", a.p(i1.e(d.class, new a(12))));
    public static final zc.c F = new zc.c("cloudLandmarkDetectionLogEvent", a.p(i1.e(d.class, new a(13))));
    public static final zc.c G = new zc.c("cloudLogoDetectionLogEvent", a.p(i1.e(d.class, new a(14))));
    public static final zc.c H = new zc.c("cloudSafeSearchDetectionLogEvent", a.p(i1.e(d.class, new a(15))));
    public static final zc.c I = new zc.c("cloudTextDetectionLogEvent", a.p(i1.e(d.class, new a(16))));
    public static final zc.c J = new zc.c("cloudWebSearchDetectionLogEvent", a.p(i1.e(d.class, new a(17))));
    public static final zc.c K = new zc.c("automlImageLabelingCreateLogEvent", a.p(i1.e(d.class, new a(23))));
    public static final zc.c L = new zc.c("automlImageLabelingLoadLogEvent", a.p(i1.e(d.class, new a(24))));
    public static final zc.c M = new zc.c("automlImageLabelingInferenceLogEvent", a.p(i1.e(d.class, new a(25))));
    public static final zc.c N = new zc.c("isModelDownloadedLogEvent", a.p(i1.e(d.class, new a(39))));
    public static final zc.c O = new zc.c("deleteModelLogEvent", a.p(i1.e(d.class, new a(40))));
    public static final zc.c P = new zc.c("aggregatedAutomlImageLabelingInferenceLogEvent", a.p(i1.e(d.class, new a(30))));
    public static final zc.c Q = new zc.c("aggregatedCustomModelInferenceLogEvent", a.p(i1.e(d.class, new a(31))));
    public static final zc.c R = new zc.c("aggregatedOnDeviceFaceDetectionLogEvent", a.p(i1.e(d.class, new a(32))));
    public static final zc.c S = new zc.c("aggregatedOnDeviceBarcodeDetectionLogEvent", a.p(i1.e(d.class, new a(33))));
    public static final zc.c T = new zc.c("aggregatedOnDeviceImageLabelDetectionLogEvent", a.p(i1.e(d.class, new a(34))));
    public static final zc.c U = new zc.c("aggregatedOnDeviceObjectInferenceLogEvent", a.p(i1.e(d.class, new a(35))));
    public static final zc.c V = new zc.c("aggregatedOnDeviceTextDetectionLogEvent", a.p(i1.e(d.class, new a(36))));
    public static final zc.c W = new zc.c("aggregatedOnDevicePoseDetectionLogEvent", a.p(i1.e(d.class, new a(46))));
    public static final zc.c X = new zc.c("aggregatedOnDeviceSegmentationLogEvent", a.p(i1.e(d.class, new a(47))));
    public static final zc.c Y = new zc.c("pipelineAccelerationInferenceEvents", a.p(i1.e(d.class, new a(69))));
    public static final zc.c Z = new zc.c("remoteConfigLogEvent", a.p(i1.e(d.class, new a(42))));

    /* renamed from: a0, reason: collision with root package name */
    public static final zc.c f29616a0 = new zc.c("inputImageConstructionLogEvent", a.p(i1.e(d.class, new a(50))));

    /* renamed from: b0, reason: collision with root package name */
    public static final zc.c f29618b0 = new zc.c("leakedHandleEvent", a.p(i1.e(d.class, new a(51))));

    /* renamed from: c0, reason: collision with root package name */
    public static final zc.c f29620c0 = new zc.c("cameraSourceLogEvent", a.p(i1.e(d.class, new a(52))));

    /* renamed from: d0, reason: collision with root package name */
    public static final zc.c f29622d0 = new zc.c("imageLabelOptionalModuleLogEvent", a.p(i1.e(d.class, new a(53))));

    /* renamed from: e0, reason: collision with root package name */
    public static final zc.c f29623e0 = new zc.c("languageIdentificationOptionalModuleLogEvent", a.p(i1.e(d.class, new a(54))));

    /* renamed from: f0, reason: collision with root package name */
    public static final zc.c f29625f0 = new zc.c("faceDetectionOptionalModuleLogEvent", a.p(i1.e(d.class, new a(60))));

    /* renamed from: g0, reason: collision with root package name */
    public static final zc.c f29627g0 = new zc.c("documentDetectionOptionalModuleLogEvent", a.p(i1.e(d.class, new a(85))));

    /* renamed from: h0, reason: collision with root package name */
    public static final zc.c f29629h0 = new zc.c("documentCroppingOptionalModuleLogEvent", a.p(i1.e(d.class, new a(86))));

    /* renamed from: i0, reason: collision with root package name */
    public static final zc.c f29630i0 = new zc.c("documentEnhancementOptionalModuleLogEvent", a.p(i1.e(d.class, new a(87))));

    /* renamed from: j0, reason: collision with root package name */
    public static final zc.c f29632j0 = new zc.c("nlClassifierOptionalModuleLogEvent", a.p(i1.e(d.class, new a(55))));

    /* renamed from: k0, reason: collision with root package name */
    public static final zc.c f29634k0 = new zc.c("nlClassifierClientLibraryLogEvent", a.p(i1.e(d.class, new a(56))));
    public static final zc.c l0 = new zc.c("accelerationAllowlistLogEvent", a.p(i1.e(d.class, new a(57))));
    public static final zc.c m0 = new zc.c("toxicityDetectionCreateEvent", a.p(i1.e(d.class, new a(62))));

    /* renamed from: n0, reason: collision with root package name */
    public static final zc.c f29638n0 = new zc.c("toxicityDetectionLoadEvent", a.p(i1.e(d.class, new a(63))));

    /* renamed from: o0, reason: collision with root package name */
    public static final zc.c f29640o0 = new zc.c("toxicityDetectionInferenceEvent", a.p(i1.e(d.class, new a(64))));

    /* renamed from: p0, reason: collision with root package name */
    public static final zc.c f29642p0 = new zc.c("barcodeDetectionOptionalModuleLogEvent", a.p(i1.e(d.class, new a(65))));

    /* renamed from: q0, reason: collision with root package name */
    public static final zc.c f29644q0 = new zc.c("customImageLabelOptionalModuleLogEvent", a.p(i1.e(d.class, new a(66))));

    /* renamed from: r0, reason: collision with root package name */
    public static final zc.c f29646r0 = new zc.c("codeScannerScanApiEvent", a.p(i1.e(d.class, new a(67))));

    /* renamed from: s0, reason: collision with root package name */
    public static final zc.c f29648s0 = new zc.c("codeScannerOptionalModuleEvent", a.p(i1.e(d.class, new a(68))));

    /* renamed from: t0, reason: collision with root package name */
    public static final zc.c f29650t0 = new zc.c("onDeviceExplicitContentCreateLogEvent", a.p(i1.e(d.class, new a(70))));

    /* renamed from: u0, reason: collision with root package name */
    public static final zc.c f29652u0 = new zc.c("onDeviceExplicitContentLoadLogEvent", a.p(i1.e(d.class, new a(71))));

    /* renamed from: v0, reason: collision with root package name */
    public static final zc.c f29654v0 = new zc.c("onDeviceExplicitContentInferenceLogEvent", a.p(i1.e(d.class, new a(72))));

    /* renamed from: w0, reason: collision with root package name */
    public static final zc.c f29656w0 = new zc.c("aggregatedOnDeviceExplicitContentLogEvent", a.p(i1.e(d.class, new a(73))));

    /* renamed from: x0, reason: collision with root package name */
    public static final zc.c f29658x0 = new zc.c("onDeviceFaceMeshCreateLogEvent", a.p(i1.e(d.class, new a(74))));

    /* renamed from: y0, reason: collision with root package name */
    public static final zc.c f29660y0 = new zc.c("onDeviceFaceMeshLoadLogEvent", a.p(i1.e(d.class, new a(75))));

    /* renamed from: z0, reason: collision with root package name */
    public static final zc.c f29662z0 = new zc.c("onDeviceFaceMeshLogEvent", a.p(i1.e(d.class, new a(76))));
    public static final zc.c A0 = new zc.c("aggregatedOnDeviceFaceMeshLogEvent", a.p(i1.e(d.class, new a(77))));
    public static final zc.c B0 = new zc.c("smartReplyOptionalModuleLogEvent", a.p(i1.e(d.class, new a(78))));
    public static final zc.c C0 = new zc.c("textDetectionOptionalModuleLogEvent", a.p(i1.e(d.class, new a(80))));
    public static final zc.c D0 = new zc.c("onDeviceImageQualityAnalysisCreateLogEvent", a.p(i1.e(d.class, new a(81))));
    public static final zc.c E0 = new zc.c("onDeviceImageQualityAnalysisLoadLogEvent", a.p(i1.e(d.class, new a(82))));
    public static final zc.c F0 = new zc.c("onDeviceImageQualityAnalysisLogEvent", a.p(i1.e(d.class, new a(83))));
    public static final zc.c G0 = new zc.c("aggregatedOnDeviceImageQualityAnalysisLogEvent", a.p(i1.e(d.class, new a(84))));
    public static final zc.c H0 = new zc.c("imageQualityAnalysisOptionalModuleLogEvent", a.p(i1.e(d.class, new a(88))));
    public static final zc.c I0 = new zc.c("imageCaptioningOptionalModuleLogEvent", a.p(i1.e(d.class, new a(89))));
    public static final zc.c J0 = new zc.c("onDeviceImageCaptioningCreateLogEvent", a.p(i1.e(d.class, new a(90))));
    public static final zc.c K0 = new zc.c("onDeviceImageCaptioningLoadLogEvent", a.p(i1.e(d.class, new a(91))));
    public static final zc.c L0 = new zc.c("onDeviceImageCaptioningInferenceLogEvent", a.p(i1.e(d.class, new a(92))));
    public static final zc.c M0 = new zc.c("aggregatedOnDeviceImageCaptioningInferenceLogEvent", a.p(i1.e(d.class, new a(93))));

    @Override // zc.a
    public final void a(Object obj, Object obj2) {
        i7 i7Var = (i7) obj;
        zc.e eVar = (zc.e) obj2;
        eVar.a(f29617b, i7Var.f29689a);
        eVar.a(f29619c, i7Var.f29690b);
        eVar.a(f29621d, null);
        eVar.a(e, null);
        eVar.a(f29624f, null);
        eVar.a(f29626g, null);
        eVar.a(f29628h, null);
        eVar.a(i, null);
        eVar.a(f29631j, null);
        eVar.a(f29633k, null);
        eVar.a(f29635l, null);
        eVar.a(f29636m, null);
        eVar.a(f29637n, null);
        eVar.a(f29639o, null);
        eVar.a(f29641p, null);
        eVar.a(f29643q, null);
        eVar.a(f29645r, null);
        eVar.a(f29647s, null);
        eVar.a(f29649t, null);
        eVar.a(f29651u, null);
        eVar.a(f29653v, null);
        eVar.a(f29655w, null);
        eVar.a(f29657x, null);
        eVar.a(f29659y, null);
        eVar.a(f29661z, null);
        eVar.a(A, null);
        eVar.a(B, null);
        eVar.a(C, null);
        eVar.a(D, null);
        eVar.a(E, null);
        eVar.a(F, null);
        eVar.a(G, null);
        eVar.a(H, null);
        eVar.a(I, null);
        eVar.a(J, null);
        eVar.a(K, null);
        eVar.a(L, null);
        eVar.a(M, null);
        eVar.a(N, null);
        eVar.a(O, null);
        eVar.a(P, null);
        eVar.a(Q, null);
        eVar.a(R, null);
        eVar.a(S, null);
        eVar.a(T, null);
        eVar.a(U, null);
        eVar.a(V, null);
        eVar.a(W, null);
        eVar.a(X, null);
        eVar.a(Y, null);
        eVar.a(Z, null);
        eVar.a(f29616a0, i7Var.f29691c);
        eVar.a(f29618b0, null);
        eVar.a(f29620c0, null);
        eVar.a(f29622d0, null);
        eVar.a(f29623e0, null);
        eVar.a(f29625f0, null);
        eVar.a(f29627g0, null);
        eVar.a(f29629h0, null);
        eVar.a(f29630i0, null);
        eVar.a(f29632j0, null);
        eVar.a(f29634k0, null);
        eVar.a(l0, null);
        eVar.a(m0, null);
        eVar.a(f29638n0, null);
        eVar.a(f29640o0, null);
        eVar.a(f29642p0, null);
        eVar.a(f29644q0, null);
        eVar.a(f29646r0, null);
        eVar.a(f29648s0, null);
        eVar.a(f29650t0, null);
        eVar.a(f29652u0, null);
        eVar.a(f29654v0, null);
        eVar.a(f29656w0, null);
        eVar.a(f29658x0, null);
        eVar.a(f29660y0, null);
        eVar.a(f29662z0, null);
        eVar.a(A0, null);
        eVar.a(B0, null);
        eVar.a(C0, null);
        eVar.a(D0, null);
        eVar.a(E0, null);
        eVar.a(F0, null);
        eVar.a(G0, null);
        eVar.a(H0, null);
        eVar.a(I0, null);
        eVar.a(J0, null);
        eVar.a(K0, null);
        eVar.a(L0, null);
        eVar.a(M0, null);
    }
}
