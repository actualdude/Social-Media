/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DataBase.OracleConnector;
import Tables.CommentsView;
import Tables.CourseView;
import Tables.FriendsView;
import Tables.GroupsView;
import Tables.MessagesView;
import Tables.UserInfo;
import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.converter.IntegerStringConverter;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Hidden Treasure
 */
public class FXMLMediaController implements Initializable {

    @FXML
    private TableColumn<UserInfo, String> infoNameColumn;
    @FXML
    private TableColumn<UserInfo, String> infoSurnameColumn;
    @FXML
    private TableColumn<UserInfo, String> infoGenderColumn;
    @FXML
    private TableColumn<UserInfo, String> infoUserDesColumn;
    @FXML
    private TableColumn<UserInfo, Date> infoDOBColumn;
    @FXML
    private TableColumn<FriendsView, String> friendsFriColumn;
    @FXML
    private TableView<UserInfo> infoTableView;
    @FXML
    private TableView<FriendsView> friendsTableView;
    @FXML
    private TableView<CourseView> coursesTableView;
    @FXML
    private Button infoUpdateAdressButton;
    @FXML
    private TextField infoStreetText;
    @FXML
    private TextField infoStreetNoText;
    @FXML
    private TextField infoPostCodeText;
    @FXML
    private TextField infoEmailText;
    @FXML
    private TextField infoCityText;
    @FXML
    private TextField infoMobileNoText;
    @FXML
    private TextField infoSkypeText;
    @FXML
    private Button infoUpdateContactButton;
    @FXML
    private Button addFriendButton;
    @FXML
    private TextField addFriendText;
    @FXML
    private TextArea friendTextArea;
    @FXML
    private Button sendButton;
    @FXML
    private TableView<MessagesView> messageTableView;
    @FXML
    private TableColumn<MessagesView, String> messageReceiver;
    @FXML
    private TableColumn<MessagesView, Timestamp> messageDate_Posted;
    @FXML
    private TableColumn<MessagesView, String> messageContent;
    @FXML
    private TableColumn<MessagesView, Integer> messageID;
    @FXML
    private Tab CoursesTab;
    @FXML
    private TableColumn<CourseView, Integer> coursesIDColumn;
    @FXML
    private TableColumn<CourseView, String> coursesShortColumn;
    @FXML
    private TableColumn<CourseView, String> coursesNameColumn;
    @FXML
    private TableColumn<CourseView, String> coursesDeptColumn;
    @FXML
    private Tab UserInfoTab;
    @FXML
    private TableColumn<UserInfo, String> infoCityColumn;
    @FXML
    private TableColumn<UserInfo, String> infoEmailColumn;
    @FXML
    private TableColumn<UserInfo, String> infoMobileNoColumn;
    @FXML
    private TableColumn<UserInfo, String> infoSkypeColumn;
    @FXML
    private Tab FriendsTab;
    @FXML
    private TableColumn<FriendsView, Integer> friendsIDColumn;
    @FXML
    private TableView<GroupsView> groupsTableView;
    @FXML
    private TableColumn<GroupsView, Integer> groupsIDColumn;
    @FXML
    private TableColumn<GroupsView, String> groupsNameColumn;
    @FXML
    private TableColumn<GroupsView, String> groupsCoursesColumn;
    @FXML
    private TableColumn<GroupsView, String> groupsGroupColumn;
    @FXML
    private TableColumn<GroupsView, String> groupsDescriptionColumn;
    @FXML
    private TableView<CommentsView> groupsCommentTableView;
    @FXML
    private TableColumn<CommentsView, Integer> groupsCommentIDColumn;
    @FXML
    private TableColumn<CommentsView, String> groupsCommentNameColumn;
    @FXML
    private TableColumn<CommentsView, String> groupsCommentEmailColumn;
    @FXML
    private TableColumn<CommentsView, String> groupsCommentColumn;
    @FXML
    private TableColumn<CommentsView, Timestamp> groupsCommentDateColumn;
    @FXML
    private TableColumn<CommentsView, String> groupsCommentLikeColumn;
    @FXML
    private TextArea groupsCommentText;
    @FXML
    private Button groupsSendCommentsButton;
    @FXML
    private TextField groupsCommentIDLike;
    @FXML
    private ComboBox<String> groupsCommentsComboBox;
    @FXML
    private TableColumn<CommentsView, String> groupsCommentGroupColumn;
    @FXML
    private Button removeFriendButton;
    @FXML
    private Button groupsCommentsUpdateLikeButton;
    @FXML
    private Button groupsCommentsUpdateMessageButton;
    @FXML
    private Button friendGetUserMessagesButton;
    @FXML
    private Button addCourseButton;
    @FXML
    private Button deleteCourseButton;
    @FXML
    private Button userInfoDeleteButton;
    @FXML
    private ComboBox<String> userInfoComboBox;
    @FXML
    private Button friendsDeleteMessageButton;
    @FXML
    private Button friendsUpdateMessageButton;
    @FXML
    private Button groupsDeleteCommentsButton;
    @FXML
    private Button groupsAddCourse_GroupButton;
    @FXML
    private Button groupsDeleteCourse_GroupButton;
    @FXML
    private TextField courseGroupsText;
    @FXML
    private Button userInfoInsertButton;
    @FXML
    private TextField courseGroupsDescriptionText;
    @FXML
    private TextField courseGroupIDText;
    @FXML
    private TextField courseIDTextField;

    ObservableList<CourseView> ob_courses = FXCollections.observableArrayList();
    ObservableList<UserInfo> ob_infoUsers = FXCollections.observableArrayList();
    ObservableList<MessagesView> ob_Messages = FXCollections.observableArrayList();
    ObservableList<FriendsView> ob_friends = FXCollections.observableArrayList();
    ObservableList<GroupsView> ob_groups = FXCollections.observableArrayList();
    ObservableList<CommentsView> ob_comments = FXCollections.observableArrayList();

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    RadioButtons rd;

    Connection connn1;
    PreparedStatement ps1;
    ResultSet rs1;

    FriendsView fv = new FriendsView();
    MessagesView mv = new MessagesView();
    CommentsView cm = new CommentsView();
    CourseView cv = new CourseView();
    GroupsView gv = new GroupsView();

    int fvInt;
    int mvInt;
    int cmInt;
    int cvInt;
    int gvInt;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override   // TABLES INITIALIZATION
    public void initialize(URL url, ResourceBundle rb) {

        groupsCommentsComboBox.getItems().addAll("1", "2");
        groupsCommentsComboBox.getSelectionModel().selectFirst();

        userInfoComboBox.getItems().addAll("ADDRESS", "CONTACT");
        userInfoComboBox.getSelectionModel().selectFirst();

        initializeCoursesColumnView();
        initializeFriendsColumnView();
        initializeUserInfoTableView();
        initializeMessagesColumnView();
        initializeGroupsTableView();
        initializeCommentsTableView();

        method_returnUserContact();
        method_returnUserAddress();
        method_returnUserDetails();
        method_returnUserFriendList();
        method_returnUserCourseList();
        method_returnUserGroupsList();
        method_returnUserCommentsList();

        selectedCells();
    }

    // INITIAIZE TABLE "MESSAGES"
    public void initializeMessagesColumnView() {

        messageTableView.getColumns().clear();

        messageTableView.setItems(ob_Messages);
        messageTableView.setEditable(true);

        messageID.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));

        messageID.setCellValueFactory(new PropertyValueFactory("message_id"));
        messageContent.setCellValueFactory(new PropertyValueFactory("message_content"));
        messageDate_Posted.setCellValueFactory(new PropertyValueFactory("date_posted"));
        messageReceiver.setCellValueFactory(new PropertyValueFactory("user_name"));

        messageTableView.getColumns().addAll(messageID, messageContent, messageDate_Posted, messageReceiver);

    }

    // INITIAIZE TABLE "COURSES"
    public void initializeCoursesColumnView() {
        coursesTableView.getColumns().clear();

        coursesTableView.setItems(ob_courses);
        coursesTableView.setEditable(true);

        coursesIDColumn.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));

        coursesIDColumn.setCellValueFactory(new PropertyValueFactory("courses_course_id"));
        coursesShortColumn.setCellValueFactory(new PropertyValueFactory("short_name"));
        coursesNameColumn.setCellValueFactory(new PropertyValueFactory("course_name"));
        coursesDeptColumn.setCellValueFactory(new PropertyValueFactory("department_name"));

        coursesTableView.getColumns().addAll(coursesIDColumn, coursesShortColumn, coursesNameColumn, coursesDeptColumn);
    }

    // INITIAIZE TABLE "FRIENDS"
    public void initializeFriendsColumnView() {
        friendsTableView.getColumns().clear();

        friendsTableView.setItems(ob_friends);
        friendsTableView.setEditable(true);

        friendsIDColumn.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));

        friendsIDColumn.setCellValueFactory(new PropertyValueFactory("user_id"));
        friendsFriColumn.setCellValueFactory(new PropertyValueFactory("user_name"));

        friendsTableView.getColumns().addAll(friendsIDColumn, friendsFriColumn);
    }

    // INITIAIZE TABLE "USER_INFO"
    public void initializeUserInfoTableView() {
        infoTableView.getColumns().clear();

        infoTableView.setItems(ob_infoUsers);
        infoTableView.setEditable(true);

        infoNameColumn.setCellValueFactory(new PropertyValueFactory("name"));
        infoSurnameColumn.setCellValueFactory(new PropertyValueFactory("surname"));
        infoGenderColumn.setCellValueFactory(new PropertyValueFactory("gender"));
        infoUserDesColumn.setCellValueFactory(new PropertyValueFactory("user_description"));
        infoDOBColumn.setCellValueFactory(new PropertyValueFactory("dob"));
        infoCityColumn.setCellValueFactory(new PropertyValueFactory("city"));
        infoEmailColumn.setCellValueFactory(new PropertyValueFactory("email"));
        infoMobileNoColumn.setCellValueFactory(new PropertyValueFactory("mobile_no"));
        infoSkypeColumn.setCellValueFactory(new PropertyValueFactory("skype"));

        infoTableView.getColumns().addAll(infoNameColumn, infoSurnameColumn,
                infoGenderColumn, infoUserDesColumn, infoDOBColumn, infoCityColumn, infoEmailColumn, infoMobileNoColumn, infoSkypeColumn);
    }

    // INITIAIZE TABLE "GROUPS"
    public void initializeGroupsTableView() {
        groupsTableView.getColumns().clear();

        groupsTableView.setItems(ob_groups);
        groupsTableView.setEditable(true);

        groupsIDColumn.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));

        groupsIDColumn.setCellValueFactory(new PropertyValueFactory("user_id"));
        groupsNameColumn.setCellValueFactory(new PropertyValueFactory("user_name"));
        groupsCoursesColumn.setCellValueFactory(new PropertyValueFactory("courses"));
        groupsGroupColumn.setCellValueFactory(new PropertyValueFactory("group_name"));
        groupsDescriptionColumn.setCellValueFactory(new PropertyValueFactory("group_description"));

        groupsTableView.getColumns().addAll(groupsIDColumn, groupsNameColumn, groupsCoursesColumn, groupsGroupColumn, groupsDescriptionColumn);

    }

    // INITIAIZE TABLE "COMMENTS"
    public void initializeCommentsTableView() {

        groupsCommentTableView.getColumns().clear();

        groupsCommentTableView.setItems(ob_comments);
        groupsCommentTableView.setEditable(true);

        groupsCommentIDColumn.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));

        groupsCommentIDColumn.setCellValueFactory(new PropertyValueFactory("comment_id"));
        groupsCommentNameColumn.setCellValueFactory(new PropertyValueFactory("user_name"));
        groupsCommentEmailColumn.setCellValueFactory(new PropertyValueFactory("email"));
        groupsCommentColumn.setCellValueFactory(new PropertyValueFactory("comments"));
        groupsCommentDateColumn.setCellValueFactory(new PropertyValueFactory("date_posted"));
        groupsCommentLikeColumn.setCellValueFactory(new PropertyValueFactory("like_data"));
        groupsCommentGroupColumn.setCellValueFactory(new PropertyValueFactory("group_name"));

        groupsCommentTableView.getColumns().addAll(groupsCommentIDColumn, groupsCommentNameColumn, groupsCommentEmailColumn, groupsCommentColumn, groupsCommentDateColumn, groupsCommentLikeColumn, groupsCommentGroupColumn);

    }

    @FXML
    /**
     * This method updates user's address and also update the user info table
     */
    private void method_infoUpdateAdress(ActionEvent event) {

        int id = rd.user_id;
        try {
            // TODO
            String street = infoStreetText.getText();
            int street_no = Integer.parseInt(infoStreetNoText.getText());
            String city = infoCityText.getText();
            int post_code = Integer.parseInt(infoPostCodeText.getText());

            String query = "UPDATE ADDRESS SET street = ?, street_no = ?, city = ?, post_code = ? where users_user_id = ?";

            conn = OracleConnector.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, street);
            ps.setInt(2, street_no);
            ps.setString(3, city);
            ps.setInt(4, post_code);
            ps.setInt(5, id);

            rs = ps.executeQuery();
            conn.commit();

            while (rs.next()) {

                updateUserDetails();

                String sr = "YOUR NEW DATA IS\n"
                        + "STREET : " + street + "\n"
                        + "STREET_NO : " + street_no + "\n"
                        + "CITY : " + city + "\n"
                        + "POST_CODE : " + post_code;

                JOptionPane.showMessageDialog(null, sr);
            }

        } catch (SQLException ex) {
            Logger.getLogger(FXMLMediaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    /**
     * This method updates user's contact and also update the user info table
     */
    private void method_infoUpdateContact(ActionEvent event) {

        int id = rd.user_id;
        try {
            // TODO

            String email = infoEmailText.getText();
            String mobile_no = infoMobileNoText.getText();
            String skype = infoSkypeText.getText();

            String query = "UPDATE CONTACT SET email = ?, mobile_no = ?, skype = ? where users_user_id = ?";

            conn = OracleConnector.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, mobile_no);
            ps.setString(3, skype);
            ps.setInt(4, id);

            rs = ps.executeQuery();
            conn.commit();

            while (rs.next()) {

                updateUserDetails();

                String st = "YOUR NEW DATA IS\n"
                        + "EMAIL : " + email + "\n"
                        + "MOBILE_NO : " + mobile_no + "\n"
                        + "SKYPE : " + skype;

                JOptionPane.showMessageDialog(null, st);

            }
        } catch (SQLException ex) {
            Logger.getLogger(FXMLMediaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    /**
     * This method is use for sending comments
     */
    private void method_groupsSendComments(ActionEvent event) {

        int id = rd.user_id;
        try {
            // TODO

            String comment = groupsCommentText.getText();
            int id_like = Integer.parseInt(groupsCommentIDLike.getText());
            int likey = Integer.parseInt(groupsCommentsComboBox.getValue());

            String query = "insert into comments values(seq_comments.nextval, ?, ?, seq_comments.nextval, ?, localtimestamp, ?)";

            conn = OracleConnector.getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ps.setInt(2, id_like);
            ps.setString(3, comment);
            ps.setInt(4, likey);

            rs = ps.executeQuery();
            conn.commit();

            while (rs.next()) {
                updateUserComments();
            }

        } catch (SQLException ex) {
            Logger.getLogger(FXMLMediaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    /**
     * This method is use for update weather or not to like or not like a
     * comments
     */
    private void method_groupsCommentsUpdateLike(ActionEvent event) {

        try {
            // TODO
            int likey = Integer.parseInt(groupsCommentsComboBox.getValue());

            String query = "UPDATE comments SET like_like_id = ? where comment_id = ?";

            conn = OracleConnector.getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, likey);
            ps.setInt(2, cmInt);

            rs = ps.executeQuery();
            conn.commit();

            while (rs.next()) {
                updateUserComments();
            }

        } catch (SQLException ex) {
            Logger.getLogger(FXMLMediaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    /**
     * This method is use for updating comments
     */
    private void method_groupsCommentsUpdateMessage(ActionEvent event) {

        try {
            // TODO

            String likey = groupsCommentText.getText();

            String query = "UPDATE comments SET comment_content = ? where comment_id = ?";

            conn = OracleConnector.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, likey);
            ps.setInt(2, cmInt);

            rs = ps.executeQuery();
            conn.commit();

            while (rs.next()) {
                updateUserComments();
            }

        } catch (SQLException ex) {
            Logger.getLogger(FXMLMediaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    /**
     * This method is use for adding friends
     */
    private void method_addFriendButton(ActionEvent event) {

        int id = rd.user_id;
        int friend_idd;

        try {
            // TODO
            conn = OracleConnector.getConnection();
            ps = conn.prepareStatement("SELECT user_id FROM users WHERE user_name = ?");
            ps.setString(1, addFriendText.getText());

            rs = ps.executeQuery();

            if (rs.next()) {

                friend_idd = rs.getInt("user_id");

                connn1 = OracleConnector.getConnection();
                ps1 = connn1.prepareStatement("INSERT INTO friends VALUES(seq_FRIENDS.nextval, ?, ?)");
                ps1.setInt(1, id);
                ps1.setInt(2, friend_idd);

                rs1 = ps1.executeQuery();
                connn1.commit();

                if (rs1.next()) {
                    updateFriendsList();
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(FXMLMediaController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    /**
     * This method is use for removing friends
     */
    private void method_removeFriend(ActionEvent event) {

        int id = rd.user_id;

        try {
            // TODO

            conn = OracleConnector.getConnection();
            ps = conn.prepareStatement("delete from friends where users_user_id = ? AND users_user_id2 = ?");
            ps.setInt(1, id);
            ps.setInt(2, fvInt);

            rs = ps.executeQuery();
            conn.commit();

            if (rs.next()) {
                updateFriendsList();
            }

        } catch (SQLException ex) {
            Logger.getLogger(FXMLMediaController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML // Send messages
    private void method_sendButton(ActionEvent event) {

        int id = rd.user_id;

        String message = friendTextArea.getText();

        String query2 = "INSERT INTO messages VALUES(seq_messages.NEXTVAL, ?, localtimestamp, ?, ?)";

        try {
            // TODO
            conn = OracleConnector.getConnection();
            ps = conn.prepareStatement(query2);
            ps.setString(1, message);
            ps.setInt(2, id);
            ps.setInt(3, fvInt);

            rs = ps.executeQuery();
            conn.commit();

            if (rs.next()) {
                updateMessageTableView();
            }

        } catch (SQLException ex) {
            Logger.getLogger(FXMLMediaController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    /**
     * This method returns messages between users
     */
    private void method_friendGetUserMessages(ActionEvent event) {

        String query = "SELECT message_id, message_content, date_posted, user_name FROM view_mess WHERE user_id = ?";

//         int id_f = Integer.parseInt(getMessageID.getText());
        try {
            // TODO

            conn = OracleConnector.getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, fvInt);

            rs = ps.executeQuery();
            conn.commit();

            while (rs.next()) {
                ob_Messages.add(new MessagesView(rs.getInt("message_id"), rs.getString("message_content"), rs.getTimestamp("date_posted"), rs.getString("user_name")));
                messageTableView.setItems(ob_Messages);
            }

        } catch (SQLException ex) {
            Logger.getLogger(FXMLMediaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method return user's contact back to GUI
     */
    private void method_returnUserContact() {

        int id = rd.user_id;

        try {
            // TODO

            String query = "SELECT email, mobile_no, skype FROM CONTACT where users_user_id = ?";
            conn = OracleConnector.getConnection();
            ps = conn.prepareStatement(query);

            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {

                String email = rs.getString("email");
                String mobile_no = rs.getString("mobile_no");
                String skype = rs.getString("skype");

                infoEmailText.setText(email);
                infoMobileNoText.setText(mobile_no);
                infoSkypeText.setText(skype);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FXMLMediaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method return user's address back to GUI
     */
    private void method_returnUserAddress() {

        int id = rd.user_id;

        String street;
        int street_no;
        String no;
        String city;
        int post_code;
        String post;

        try {
            // TODO

            String query = "SELECT street, street_no, city, post_code FROM ADDRESS where users_user_id = ?";
            conn = OracleConnector.getConnection();
            ps = conn.prepareStatement(query);

            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {

                street = rs.getString("street");
                street_no = rs.getInt("street_no");
                no = Integer.toString(street_no);
                city = rs.getString("city");
                post_code = rs.getInt("post_code");
                post = Integer.toString(post_code);

                infoStreetText.setText(street);
                infoStreetNoText.setText(no);
                infoCityText.setText(city);
                infoPostCodeText.setText(post);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FXMLMediaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method return user's details back to GUI
     */
    private void method_returnUserDetails() {

        int id = rd.user_id;
        String query = "SELECT user_name, user_surname, gender, user_description, dob, city, email, mobile_no, skype  FROM VIEW_INFOUSERS where user_id = ?";

        try {
            // TODO
            conn = OracleConnector.getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);

            rs = ps.executeQuery();

            while (rs.next()) {
                ob_infoUsers.add(new UserInfo(rs.getString("user_name"), rs.getString("user_surname"), rs.getString("gender"), rs.getString("user_description"), rs.getDate("dob"), rs.getString("city"), rs.getString("email"), rs.getString("mobile_no"), rs.getString("skype")));
                infoTableView.setItems(ob_infoUsers);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FXMLMediaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method return user's friend List back to GUI
     */
    private void method_returnUserFriendList() {

        int id = rd.user_id;

        try {
            // TODO
            String query = "SELECT u.user_id, u.user_name FROM users u left JOIN view_friends ON u.user_id = view_friends.users_user_id2 WHERE view_friends.user_id = ?";

            conn = OracleConnector.getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);

            rs = ps.executeQuery();

            while (rs.next()) {
                ob_friends.add(new FriendsView(rs.getInt("user_id"), rs.getString("user_name")));
            }
            friendsTableView.setItems(ob_friends);

        } catch (SQLException ex) {
            Logger.getLogger(FXMLMediaController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Selectes Tables Cells for manipulation
    private void selectedCells() {

        friendsTableView.setOnMouseClicked(event -> {
            fv = friendsTableView.getSelectionModel().getSelectedItem();
            fvInt = fv.getUser_id();
        });

        messageTableView.setOnMouseClicked(event -> {
            mv = messageTableView.getSelectionModel().getSelectedItem();
            mvInt = mv.getMessage_id();
        });

        groupsCommentTableView.setOnMouseClicked(event -> {
            cm = groupsCommentTableView.getSelectionModel().getSelectedItem();
            cmInt = cm.getComment_id();
        });

        coursesTableView.setOnMouseClicked(event -> {
            cv = coursesTableView.getSelectionModel().getSelectedItem();
            cvInt = cv.getCourses_course_id();
        });
        
        groupsTableView.setOnMouseClicked(event -> {
        gv = groupsTableView.getSelectionModel().getSelectedItem();
        gvInt = gv.getUser_id();
        });

    }

    /**
     * This method return user's courses back to GUI
     */
    private void method_returnUserCourseList() {

        int id = rd.user_id;

        try {
            // TODO
            String query = "SELECT courses_course_id, short_name, course_name, department_name FROM view_courses WHERE users_user_id = ?";

            conn = OracleConnector.getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);

            rs = ps.executeQuery();

            while (rs.next()) {
                ob_courses.add(new CourseView(rs.getInt("courses_course_id"), rs.getString("short_name"), rs.getString("course_name"), rs.getString("department_name")));
                coursesTableView.setItems(ob_courses);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FXMLMediaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method updates the group table view
     */
    private void method_returnUserGroupsList() {

        int id = rd.user_id;

        try {
            // TODO
            String query = "SELECT groups_group_id, user_name, short_name, group_name, group_description FROM view_groups WHERE users_user_id = ?";

            conn = OracleConnector.getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);

            rs = ps.executeQuery();

            while (rs.next()) {
                ob_groups.add(new GroupsView(rs.getInt("groups_group_id"), rs.getString("user_name"), rs.getString("short_name"), rs.getString("group_name"), rs.getString("group_description")));
                groupsTableView.setItems(ob_groups);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FXMLMediaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method updates the comments table view
     */
    private void method_returnUserCommentsList() {

        int id = rd.user_id;

        try {
            // TODO
            String query = "SELECT comment_id, user_name, email, comment_content, date_posted, like_data, group_name FROM view_comments WHERE user_id = ?";

            conn = OracleConnector.getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);

            rs = ps.executeQuery();

            while (rs.next()) {
                ob_comments.add(new CommentsView(rs.getInt("comment_id"), rs.getString("user_name"), rs.getString("email"), rs.getString("comment_content"), rs.getTimestamp("date_posted"), rs.getString("like_data"), rs.getString("group_name")));
                groupsCommentTableView.setItems(ob_comments);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FXMLMediaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method updates the friend table view
     */
    public void updateFriendsList() {

        friendsTableView.getItems().clear();

        int id = rd.user_id;

        try {
            // TODO

            conn = OracleConnector.getConnection();
            ps = conn.prepareStatement("SELECT u.user_id, u.user_name FROM users u left JOIN view_friends ON u.user_id = view_friends.users_user_id2 WHERE view_friends.user_id = ?");
            ps.setInt(1, id);

            rs = ps.executeQuery();
            conn.commit();

            while (rs.next()) {
                ob_friends.add(new FriendsView(rs.getInt("user_id"), rs.getString("user_name")));
            }
            friendsTableView.setItems(ob_friends);
            
        } catch (SQLException ex) {
            Logger.getLogger(FXMLMediaController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * This method updates the user's details table view
     */
    public void updateUserDetails() {

        infoTableView.getItems().clear();

        int id = rd.user_id;
        String query = "SELECT user_name, user_surname, gender, user_description, dob, city, email, mobile_no, skype  FROM VIEW_INFOUSERS where user_id = ?";

        try {
            // TODO
            conn = OracleConnector.getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);

            rs = ps.executeQuery();

            while (rs.next()) {
                ob_infoUsers.add(new UserInfo(rs.getString("user_name"), rs.getString("user_surname"), rs.getString("gender"), rs.getString("user_description"), rs.getDate("dob"), rs.getString("city"), rs.getString("email"), rs.getString("mobile_no"), rs.getString("skype")));
            }
            infoTableView.setItems(ob_infoUsers);
        } catch (SQLException ex) {
            Logger.getLogger(FXMLMediaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method updates the comments table view
     */
    public void updateUserComments() {

        groupsCommentTableView.getItems().clear();

        int id = rd.user_id;
        String query = "select comment_id, user_name, email, comment_content, date_posted, like_data, group_name from view_comments where user_id = ?";

        try {
            // TODO
            conn = OracleConnector.getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);

            rs = ps.executeQuery();

            while (rs.next()) {
                ob_comments.add(new CommentsView(rs.getInt("comment_id"), rs.getString("user_name"), rs.getString("email"), rs.getString("comment_content"), rs.getTimestamp("date_posted"), rs.getString("like_data"), rs.getString("group_name")));
            }
            groupsCommentTableView.setItems(ob_comments);
        } catch (SQLException ex) {
            Logger.getLogger(FXMLMediaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Updates back the Message Table View after Insertion Or Delete Or Update
    private void updateMessageTableView() {

        messageTableView.getItems().clear();

        String query2 = "SELECT message_id, message_content, date_posted, user_name FROM view_mess WHERE user_id = ?";

        try {

            conn = OracleConnector.getConnection();
            ps = conn.prepareStatement(query2);
            ps.setInt(1, fvInt);

            rs = ps.executeQuery();

            while (rs.next()) {
                ob_Messages.add(new MessagesView(rs.getInt("message_id"), rs.getString("message_content"), rs.getTimestamp("date_posted"), rs.getString("user_name")));
            }
            messageTableView.setItems(ob_Messages);

        } catch (SQLException ex) {
            Logger.getLogger(FXMLMediaController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Updates back the Group Table View after Insertion Or Delete Or Update
    public void updateCourseGroups() {

        groupsTableView.getItems().clear();

        int id = rd.user_id;

        try {
            // TODO
            String query = "SELECT groups_group_id, user_name, short_name, group_name, group_description FROM view_groups WHERE users_user_id = ?";

            conn = OracleConnector.getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);

            rs = ps.executeQuery();

            while (rs.next()) {
                ob_groups.add(new GroupsView(rs.getInt("groups_group_id"), rs.getString("user_name"), rs.getString("short_name"), rs.getString("group_name"), rs.getString("group_description")));
            }
            groupsTableView.setItems(ob_groups);
        } catch (SQLException ex) {
            Logger.getLogger(FXMLMediaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Updates back the Course Table View after Insertion Or Delete Or Update
    public void updateCourse() {

        coursesTableView.getItems().clear();

        int id = rd.user_id;

        try {
            // TODO
            String query = "SELECT courses_course_id, short_name, course_name, department_name FROM view_courses WHERE users_user_id = ?";

            conn = OracleConnector.getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);

            rs = ps.executeQuery();

            while (rs.next()) {
                ob_courses.add(new CourseView(rs.getInt("courses_course_id"), rs.getString("short_name"), rs.getString("course_name"), rs.getString("department_name")));

            }
            coursesTableView.setItems(ob_courses);
        } catch (SQLException ex) {
            Logger.getLogger(FXMLMediaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML //Adds new course to users
    private void method_addCourse(ActionEvent event) {

        int id = rd.user_id;

        int course_id = Integer.parseInt(courseIDTextField.getText());

        String query = "insert into users_courses values(?, ?, seq_user_courses.nextval)";

        try {
            // TODO
            conn = OracleConnector.getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, course_id);
            ps.setInt(2, id);

            rs = ps.executeQuery();
            conn.commit();

            if (rs.next()) {
                updateCourse();
            }

        } catch (SQLException ex) {
            Logger.getLogger(FXMLMediaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML // Deletes User's courses
    private void method_deleteCourse(ActionEvent event) {

        int id = rd.user_id;

        try {
            // TODO

            String query = "delete from users_courses where users_user_id = ? and courses_course_id = ?";

            conn = OracleConnector.getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ps.setInt(2, cvInt);

            rs = ps.executeQuery();
            conn.commit();

            while (rs.next()) {
                updateCourse();
            }

        } catch (SQLException ex) {
            Logger.getLogger(FXMLMediaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML // Deletes User details
    private void method_userInfoDelete(ActionEvent event) {

        int id = rd.user_id;

        if (userInfoComboBox.getValue().equals("ADDRESS")) {

            try {
                // TODO
                conn = OracleConnector.getConnection();
                ps = conn.prepareStatement("DELETE FROM address WHERE users_user_id = ?");
                ps.setInt(1, id);

                rs = ps.executeQuery();
                conn.commit();

                if (rs.next()) {

                    infoStreetText.clear();
                    infoStreetNoText.clear();
                    infoCityText.clear();
                    infoPostCodeText.clear();

                    updateUserDetails();

                    String sr = "YOUR NEW DATA HAS BEEN DELETED";
                    JOptionPane.showMessageDialog(null, sr);

                }

            } catch (SQLException ex) {
                Logger.getLogger(FXMLMediaController.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (userInfoComboBox.getValue().equals("CONTACT")) {

            try {
                // TODO
                conn = OracleConnector.getConnection();
                ps = conn.prepareStatement("DELETE FROM contact WHERE users_user_id = ?");
                ps.setInt(1, id);

                rs = ps.executeQuery();
                conn.commit();

                if (rs.next()) {

                    infoEmailText.clear();
                    infoMobileNoText.clear();
                    infoSkypeText.clear();

                    updateUserDetails();

                    String sr = "YOUR NEW DATA HAS BEEN DELETED";
                    JOptionPane.showMessageDialog(null, sr);

                }

            } catch (SQLException ex) {
                Logger.getLogger(FXMLMediaController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    @FXML // Deletes messages between friends
    private void method_friendsDeleteMessage(ActionEvent event) {

        try {
            // TODO
            conn = OracleConnector.getConnection();
            ps = conn.prepareStatement("DELETE FROM messages WHERE message_id = ?");
            ps.setInt(1, mvInt);

            rs = ps.executeQuery();
            conn.commit();

            if (rs.next()) {
                updateMessageTableView();
            }

        } catch (SQLException ex) {
            Logger.getLogger(FXMLMediaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML // Updates messages between friends
    private void method_friendsUpdateMessage(ActionEvent event) {

        try {
            // TODO
            conn = OracleConnector.getConnection();
            ps = conn.prepareStatement("UPDATE messages SET message_content = ? WHERE message_id = ?");
            ps.setString(1, friendTextArea.getText());
            ps.setInt(2, mvInt);

            rs = ps.executeQuery();
            conn.commit();

            if (rs.next()) {
                updateMessageTableView();
            }

        } catch (SQLException ex) {
            Logger.getLogger(FXMLMediaController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML // Deletes Comments
    private void method_groupsDeleteComments(ActionEvent event) {

        try {
            // TODO
            conn = OracleConnector.getConnection();
            ps = conn.prepareStatement("DELETE FROM comments WHERE comment_id = ?");
            ps.setInt(1, cmInt);

            rs = ps.executeQuery();
            conn.commit();

            if (rs.next()) {
                updateUserComments();
            }

        } catch (SQLException ex) {
            Logger.getLogger(FXMLMediaController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void method_groupsAddCourse_Group(ActionEvent event) {
        
        int id = rd.user_id;
        int course_id = Integer.parseInt(courseGroupIDText.getText());

        String query = "insert into user_group values(seq_user_group.nextval, ?, ?)";

        try {
            // TODO
            conn = OracleConnector.getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ps.setInt(2, course_id);

            rs = ps.executeQuery();
            conn.commit();

            if (rs.next()) {
                updateCourseGroups();
            }

        } catch (SQLException ex) {
            Logger.getLogger(FXMLMediaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void method_groupsDeleteCourse_Group(ActionEvent event) {

        int id = rd.user_id;

        String query = "delete from user_group where users_user_id = ? and groups_group_id = ?";

        try {
            // TODO
            conn = OracleConnector.getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ps.setInt(2, gvInt);

            rs = ps.executeQuery();
            conn.commit();

            if (rs.next()) {
                updateCourseGroups();
            }

        } catch (SQLException ex) {
            Logger.getLogger(FXMLMediaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML // Inserts new User details
    private void method_userInfoInsert(ActionEvent event) {

        int id = rd.user_id;
        ///////////////////////////////////////////////////////////////////////////////      
        String st = infoStreetText.getText();
        int st_no = Integer.parseInt(infoStreetNoText.getText());
        String cty = infoCityText.getText();
        int pst_cod = Integer.parseInt(infoPostCodeText.getText());
        /////////////////////////////////////////////////////////////////////////////////          
        String eml = infoEmailText.getText();
        String mob_no = infoMobileNoText.getText();
        String skyp = infoSkypeText.getText();

        if (userInfoComboBox.getValue().equals("ADDRESS")) {

            try {
                // TODO
                conn = OracleConnector.getConnection();
                ps = conn.prepareStatement("INSERT INTO address VALUES (seq_address.NEXTVAL, ?, ?, ?, ?, ?)");
                ps.setString(1, st);
                ps.setInt(2, st_no);
                ps.setString(3, cty);
                ps.setInt(4, pst_cod);
                ps.setInt(5, id);

                rs = ps.executeQuery();

                if (rs.next()) {

                    updateUserDetails();

                    String sr = "NEW DATA ISERTED\n"
                            + "STREET : " + st + "\n"
                            + "STREET_NO : " + st_no + "\n"
                            + "CITY : " + cty + "\n"
                            + "POST_CODE : " + pst_cod;

                    JOptionPane.showMessageDialog(null, sr);

                }
                conn.commit();
            } catch (SQLException ex) {
                Logger.getLogger(FXMLMediaController.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (userInfoComboBox.getValue().equals("CONTACT")) {

            try {
                // TODO
                conn = OracleConnector.getConnection();
                ps = conn.prepareStatement("INSERT INTO contact VALUES(?, ?, ?, ?, seq_contact.NEXTVAL)");
                ps.setInt(1, id);
                ps.setString(2, eml);
                ps.setString(3, mob_no);
                ps.setString(4, skyp);

                rs = ps.executeQuery();

                if (rs.next()) {

                    updateUserDetails();

                    String str = "NEW DATA ISERTED\n"
                            + "EMAIL : " + eml + "\n"
                            + "MOBILE_NO : " + mob_no + "\n"
                            + "SKYPE : " + skyp;

                    JOptionPane.showMessageDialog(null, str);

                }
                conn.commit();
            } catch (SQLException ex) {
                Logger.getLogger(FXMLMediaController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}
