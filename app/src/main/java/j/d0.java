package j;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f18624a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f18625b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f18626c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f18627d;
    public final ImageView e;

    public d0(View view) {
        this.f18624a = (TextView) view.findViewById(R.id.text1);
        this.f18625b = (TextView) view.findViewById(R.id.text2);
        this.f18626c = (ImageView) view.findViewById(R.id.icon1);
        this.f18627d = (ImageView) view.findViewById(R.id.icon2);
        this.e = (ImageView) view.findViewById(com.daren.scraply.R.id.edit_query);
    }
}
