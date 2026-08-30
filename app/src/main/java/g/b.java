package g;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import f.i;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import qe.s;
import wa.q6;
import wa.u6;
import z5.h;

/* loaded from: classes.dex */
public final class b extends q6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17003a;

    @Override // wa.q6
    public final Intent a(Context context, Object obj) {
        switch (this.f17003a) {
            case 0:
                String str = (String) obj;
                str.getClass();
                Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str);
                type.getClass();
                return type;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                Intent putExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str2).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                putExtra.getClass();
                return putExtra;
            case 2:
                Uri uri = (Uri) obj;
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                if (Build.VERSION.SDK_INT >= 26 && uri != null) {
                    intent.putExtra("android.provider.extra.INITIAL_URI", uri);
                }
                return intent;
            case 3:
                String str3 = (String) obj;
                str3.getClass();
                Intent putExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str3});
                putExtra2.getClass();
                return putExtra2;
            case 4:
                i iVar = (i) obj;
                iVar.getClass();
                Intent putExtra3 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", iVar);
                putExtra3.getClass();
                return putExtra3;
            default:
                Uri uri2 = (Uri) obj;
                uri2.getClass();
                Intent putExtra4 = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uri2);
                putExtra4.getClass();
                putExtra4.setClipData(ClipData.newRawUri("", uri2));
                putExtra4.addFlags(3);
                return putExtra4;
        }
    }

    @Override // wa.q6
    public h b(Context context, Object obj) {
        switch (this.f17003a) {
            case 0:
                ((String) obj).getClass();
                return null;
            case 1:
                ((String) obj).getClass();
                return null;
            case 2:
                return null;
            case 3:
                String str = (String) obj;
                str.getClass();
                if (u6.a(context, str) == 0) {
                    return new h(14, Boolean.TRUE);
                }
                return null;
            case 4:
            default:
                return super.b(context, obj);
            case 5:
                ((Uri) obj).getClass();
                return null;
        }
    }

    @Override // wa.q6
    public final Object c(Intent intent, int i) {
        boolean z3;
        switch (this.f17003a) {
            case 0:
                if (i != -1) {
                    intent = null;
                }
                if (intent == null) {
                    return null;
                }
                return intent.getData();
            case 1:
                if (i != -1) {
                    intent = null;
                }
                if (intent != null) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Uri data = intent.getData();
                    if (data != null) {
                        linkedHashSet.add(data);
                    }
                    ClipData clipData = intent.getClipData();
                    if (clipData != null || !linkedHashSet.isEmpty()) {
                        if (clipData != null) {
                            int itemCount = clipData.getItemCount();
                            for (int i10 = 0; i10 < itemCount; i10++) {
                                Uri uri = clipData.getItemAt(i10).getUri();
                                if (uri != null) {
                                    linkedHashSet.add(uri);
                                }
                            }
                        }
                        return new ArrayList(linkedHashSet);
                    }
                }
                return s.f24023u;
            case 2:
                if (i != -1) {
                    intent = null;
                }
                if (intent == null) {
                    return null;
                }
                return intent.getData();
            case 3:
                if (intent != null && i == -1) {
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    boolean z9 = false;
                    if (intArrayExtra != null) {
                        int length = intArrayExtra.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 < length) {
                                if (intArrayExtra[i11] == 0) {
                                    z9 = true;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    }
                    return Boolean.valueOf(z9);
                }
                return Boolean.FALSE;
            case 4:
                return new f.a(intent, i);
            default:
                if (i == -1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
        }
    }

    public /* synthetic */ b(int i) {
        this.f17003a = i;
    }
}
