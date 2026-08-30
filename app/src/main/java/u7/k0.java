package u7;
import r0.a1;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import java.io.InputStream;
import w7.p9;

/* loaded from: classes.dex */
public final class k0 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26392u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Context f26393v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f26394w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(Context context, a1 a1Var, te.c cVar, int i) {
        super(2, cVar);
        this.f26392u = i;
        this.f26393v = context;
        this.f26394w = a1Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f26392u) {
            case 0:
                return new k0(this.f26393v, this.f26394w, cVar, 0);
            default:
                return new k0(this.f26393v, this.f26394w, cVar, 1);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f26392u) {
            case 0:
                k0 k0Var = (k0) create(zVar, cVar);
                pe.z zVar2 = pe.z.f22715a;
                k0Var.invokeSuspend(zVar2);
                return zVar2;
            default:
                k0 k0Var2 = (k0) create(zVar, cVar);
                pe.z zVar3 = pe.z.f22715a;
                k0Var2.invokeSuspend(zVar3);
                return zVar3;
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f26392u;
        pe.z zVar = pe.z.f22715a;
        Context context = this.f26393v;
        a1 a1Var = this.f26394w;
        switch (i) {
            case 0:
                pe.a.e(obj);
                pe.n nVar = f2.f26168a;
                context.getClass();
                String[] strArr = {"_id"};
                Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                Bitmap bitmap = null;
                try {
                    Cursor query = context.getContentResolver().query(uri, strArr, null, null, "date_added DESC");
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                Uri withAppendedId = ContentUris.withAppendedId(uri, query.getLong(query.getColumnIndexOrThrow("_id")));
                                withAppendedId.getClass();
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inSampleSize = 8;
                                InputStream openInputStream = context.getContentResolver().openInputStream(withAppendedId);
                                if (openInputStream != null) {
                                    try {
                                        Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream, null, options);
                                        openInputStream.close();
                                        query.close();
                                        bitmap = decodeStream;
                                    } finally {
                                    }
                                }
                            }
                            query.close();
                        } finally {
                        }
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                float f10 = u0.f26903a;
                a1Var.setValue(bitmap);
                return zVar;
            default:
                pe.a.e(obj);
                a1Var.setValue(p9.f28915a.p(context));
                return zVar;
        }
    }
}
