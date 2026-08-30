package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zv1 {

    /* renamed from: a, reason: collision with root package name */
    public int f13277a;

    /* renamed from: b, reason: collision with root package name */
    public int f13278b;

    /* renamed from: c, reason: collision with root package name */
    public Object f13279c;

    /* renamed from: d, reason: collision with root package name */
    public Object f13280d;
    public Object e;

    /* renamed from: f, reason: collision with root package name */
    public Object f13281f;

    /* renamed from: g, reason: collision with root package name */
    public Object f13282g;

    /* renamed from: h, reason: collision with root package name */
    public Object f13283h;

    public zv1(mw1 mw1Var, mw1 mw1Var2, int i, int i10, gv1 gv1Var, nz nzVar, uh uhVar, Object obj) {
        this.f13279c = mw1Var;
        this.f13280d = mw1Var2;
        this.f13277a = i;
        this.f13278b = i10;
        this.e = gv1Var;
        this.f13281f = nzVar;
        this.f13282g = uhVar;
        this.f13283h = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:134:0x0191. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0023. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.zv1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18, types: [com.google.android.gms.internal.consent_sdk.w, java.lang.Object] */
    public static zv1 a(JsonReader jsonReader) {
        int i;
        ?? obj = new Object();
        obj.f13277a = 1;
        List list = Collections.EMPTY_LIST;
        obj.f13281f = list;
        obj.f13282g = list;
        obj.f13278b = 1;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int i10 = 3;
            switch (nextName.hashCode()) {
                case -2001388947:
                    if (nextName.equals("consent_signal")) {
                        String nextString = jsonReader.nextString();
                        switch (nextString.hashCode()) {
                            case -2058725357:
                                if (nextString.equals("CONSENT_SIGNAL_COLLECT_CONSENT")) {
                                    i10 = 5;
                                    obj.f13277a = i10;
                                } else {
                                    q.x.p("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                    return null;
                                }
                            case -1969035850:
                                if (nextString.equals("CONSENT_SIGNAL_ERROR")) {
                                    i10 = 7;
                                    obj.f13277a = i10;
                                } else {
                                    q.x.p("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                    return null;
                                }
                            case -1263695752:
                                if (nextString.equals("CONSENT_SIGNAL_UNKNOWN")) {
                                    i10 = 1;
                                    obj.f13277a = i10;
                                } else {
                                    q.x.p("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                    return null;
                                }
                            case -954325659:
                                if (!nextString.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                                    q.x.p("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                    return null;
                                }
                                obj.f13277a = i10;
                            case -918677260:
                                if (nextString.equals("CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION")) {
                                    i10 = 8;
                                    obj.f13277a = i10;
                                } else {
                                    q.x.p("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                    return null;
                                }
                            case 429411856:
                                if (nextString.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                                    i10 = 4;
                                    obj.f13277a = i10;
                                } else {
                                    q.x.p("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                    return null;
                                }
                            case 467888915:
                                if (nextString.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                                    i10 = 2;
                                    obj.f13277a = i10;
                                } else {
                                    q.x.p("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                    return null;
                                }
                            case 1725474845:
                                if (nextString.equals("CONSENT_SIGNAL_NOT_REQUIRED")) {
                                    i10 = 6;
                                    obj.f13277a = i10;
                                } else {
                                    q.x.p("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                    return null;
                                }
                            default:
                                q.x.p("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                return null;
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                case -1938755376:
                    if (nextName.equals("error_message")) {
                        obj.e = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                case -1851537225:
                    if (nextName.equals("consent_form_base_url")) {
                        obj.f13280d = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                case -1734348803:
                    if (nextName.equals("client_side_pingback_url")) {
                        obj.f13283h = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                case -1324537865:
                    if (nextName.equals("privacy_options_required")) {
                        String nextString2 = jsonReader.nextString();
                        int hashCode = nextString2.hashCode();
                        if (hashCode != -1888946261) {
                            if (hashCode != 389487519) {
                                if (hashCode == 433141802 && nextString2.equals("UNKNOWN")) {
                                    i10 = 1;
                                    obj.f13278b = i10;
                                }
                                q.x.p("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(nextString2));
                                return null;
                            }
                            if (nextString2.equals("REQUIRED")) {
                                i10 = 2;
                                obj.f13278b = i10;
                            } else {
                                q.x.p("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(nextString2));
                                return null;
                            }
                        } else {
                            if (!nextString2.equals("NOT_REQUIRED")) {
                                q.x.p("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(nextString2));
                                return null;
                            }
                            obj.f13278b = i10;
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -1161803523:
                    if (nextName.equals("actions")) {
                        obj.f13282g = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            ?? obj2 = new Object();
                            obj2.f13588b = 1;
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                String nextName2 = jsonReader.nextName();
                                int hashCode2 = nextName2.hashCode();
                                if (hashCode2 != -2105551094) {
                                    if (hashCode2 == 1583758243 && nextName2.equals("action_type")) {
                                        String nextString3 = jsonReader.nextString();
                                        int hashCode3 = nextString3.hashCode();
                                        if (hashCode3 != 64208429) {
                                            if (hashCode3 != 82862015) {
                                                if (hashCode3 == 1856333582 && nextString3.equals("UNKNOWN_ACTION_TYPE")) {
                                                    i = 1;
                                                    obj2.f13588b = i;
                                                }
                                                q.x.p("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(nextString3));
                                                return null;
                                            }
                                            if (nextString3.equals("WRITE")) {
                                                i = 2;
                                                obj2.f13588b = i;
                                            } else {
                                                q.x.p("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(nextString3));
                                                return null;
                                            }
                                        } else if (nextString3.equals("CLEAR")) {
                                            i = 3;
                                            obj2.f13588b = i;
                                        } else {
                                            q.x.p("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(nextString3));
                                            return null;
                                        }
                                    }
                                    jsonReader.skipValue();
                                } else if (nextName2.equals("args_json")) {
                                    obj2.f13587a = jsonReader.nextString();
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            ((List) obj.f13282g).add(obj2);
                        }
                        jsonReader.endArray();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -986806987:
                    if (nextName.equals("request_info_keys")) {
                        obj.f13281f = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            ((List) obj.f13281f).add(jsonReader.nextString());
                        }
                        jsonReader.endArray();
                    } else {
                        jsonReader.skipValue();
                    }
                case -790907624:
                    if (nextName.equals("consent_form_payload")) {
                        obj.f13279c = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                default:
                    jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return obj;
    }

    public /* synthetic */ zv1 b(gv1 gv1Var) {
        return new zv1((mw1) this.f13279c, (mw1) this.f13280d, this.f13277a, this.f13278b, gv1Var, (nz) this.f13281f, (uh) this.f13282g, this.f13283h);
    }

    public /* synthetic */ boolean c() {
        return Objects.equals(((mw1) this.f13279c).f8459o, "audio/raw");
    }
}
