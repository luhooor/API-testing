package api.service;


import org.json.JSONObject;
import net.serenitybdd.rest.SerenityRest;

public class reqres {

    private static final String REQRES_URL = "https://reqres.in";

    public void postLogin(String email, String password) {
        JSONObject bodyjson = new JSONObject();

        if (password.equals("")) {
            bodyjson.put("email", email);
        } else {
            bodyjson.put("email", email);
            bodyjson.put("password", password);
        }


        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(bodyjson.toString())
                .post(REQRES_URL+"/api/login");
    }

    public void postRegister(String email, String password) {
        JSONObject bodyjson = new JSONObject();

        if (password.equals("")) {
            bodyjson.put("email", email);
        } else {
            bodyjson.put("email", email);
            bodyjson.put("password", password);
        }

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(bodyjson.toString())
                .post(REQRES_URL+"/api/register");
    }

    public void getSingleUser(int id){
        SerenityRest.get(REQRES_URL+"/api/users/"+id);
    }

    public void getSingleUser(String value){
        SerenityRest.get(REQRES_URL+"/api/users/"+value);
    }

    public void createUser(String name, String job) {
        JSONObject bodyjson = new JSONObject();

        if (name.equals("")){
            bodyjson.put("job", job);
        } else if (job.equals("")) {
            bodyjson.put("name", name);
        } else {
            bodyjson.put("name", name);
            bodyjson.put("job", job);
        }

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(bodyjson.toString())
                .post(REQRES_URL+"/api/users");
    }

    public void updateUser(String name, String job, int id) {
        JSONObject bodyjson = new JSONObject();

        bodyjson.put("name", name);
        bodyjson.put("job", job);

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .body(bodyjson.toString())
                .put(REQRES_URL+"/api/users/"+id);
    }

    public void deleteUser(int id) {
        SerenityRest.delete(REQRES_URL+"/api/users/"+id);
    }

}
