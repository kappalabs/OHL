//
//package com.kappa_labs.ohunter.lib.requests;
//
//import com.kappa_labs.ohunter.lib.entities.Photo;
//import com.kappa_labs.ohunter.lib.entities.Player;
//import java.io.Serializable;
//
///**
// * Class for comunication with server. Creates sceleton for chosen Request
// * class, which will be reconstucted on the server side.
// */
//public class RequestPkg implements Serializable {
//
//    /**
//     * Type of this request package.
//     */
//    private Request.TYPE type;
//    
//    /**
//     * Who created the request.
//     */
//    protected int uid;
//    /**
//     * Time of creation of the request.
//     */
//    private final long time;
//    protected Player player;
//    
////    /**
////     * Parameters of the appropriate constructor.
////     */
////    protected Object[] params;
//
//    
//    /**
//     * Create new Request package with unknown type.
//     */
//    protected RequestPkg() {
//        this.type = Request.TYPE.UNKNOWN;
//        this.time = System.currentTimeMillis();
//    }
//    
////    /**
////     * Create new Request package with specified type.
////     * 
////     * @param type Type of the Request, which this package represents.
////     * @param params Parameters of the Request, which this package represents.
////     */
////    protected RequestPkg(Request.TYPE type, Object[] params) {
////        this.type = type;
////        this.params = params;
////        this.time = System.currentTimeMillis();
////    }
//    
////    /**
////     * Gets the index-th parameter for the implementation class.
////     * If the type is not consitent or not set, then null is returned.
////     * 
////     * @param <T> Desired type of the parametr.
////     * @param index Index of the desired parameter.
////     * @param clazz Class of the desired type.
////     * @return The index-th parameter for the implementation class casted to required type.
////     */
////    public <T> T getParam(int index, Class<T> clazz) {
////        if (params != null && params.length > index) {
////            if (clazz.isInstance(params[index])) {
////                return clazz.cast(params[index]);
////            }
////        }
////        return null;
////    }
//    
//    /**
//     * Gets the type of request.
//     * 
//     * @return The type of request.
//     */
//    public Request.TYPE getType() {
//        return type;
//    }
//
//    /**
//     * Gets the time of creation of this request.
//     * 
//     * @return The time of creation of this request.
//     */
//    public long getTime() {
//        return time;
//    }
//}
