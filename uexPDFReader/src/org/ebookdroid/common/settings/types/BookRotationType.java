package org.ebookdroid.common.settings.types;


import org.emdev.BaseDroidApp;
import org.emdev.utils.enums.ResourceConstant;
import org.zywx.wbpalmstar.engine.universalex.EUExUtil;

public enum BookRotationType implements ResourceConstant {

//    /**
//    *
//    */
//    UNSPECIFIED(R.string.pref_rotation_unspecified, null),
//    /**
//    *
//    */
//    LANDSCAPE(R.string.pref_rotation_land, RotationType.LANDSCAPE),
//    /**
//    *
//    */
//    PORTRAIT(R.string.pref_rotation_port, RotationType.PORTRAIT);
	
	 /**
    *
    */
    UNSPECIFIED(EUExUtil.getResStringID("plugin_pdf_pref_rotation_unspecified"), null),
    /**
    *
    */
    LANDSCAPE(EUExUtil.getResStringID("plugin_pdf_pref_rotation_land"), RotationType.LANDSCAPE),
    /**
    *
    */
    PORTRAIT(EUExUtil.getResStringID("plugin_pdf_pref_rotation_port"), RotationType.PORTRAIT);


    private final String resValue;

    private final RotationType orientation;

    private BookRotationType(final int resId, final RotationType orientation) {
        this.resValue = BaseDroidApp.context.getString(resId);
        this.orientation = orientation;
    }

    @Override
    public String getResValue() {
        return resValue;
    }

    public int getOrientation(final RotationType defRotation) {
        return orientation != null ? orientation.getOrientation() : defRotation.getOrientation();
    }
}
