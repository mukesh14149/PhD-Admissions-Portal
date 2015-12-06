Project Assignment 1
_______________________

You are supposed to design a system for PhD Admissions

At applicant’s end:
-----------------------



You are required to design a set of forms to apply for PhD Admissions. The shared html file describes
the outlook and features of the form pages to design.
You have to use Javafx to design the GUI window. As of now, the design and functionality are
applicable only on your local machine i.e we shall not deal with remote(web-based) form
applications as of now.
Corresponding to every application, you are supposed to maintain all the data (obtained from
textfields, dropdowns, radiobuttons etc.) along with the timestamp of form submission in a file.

On clicking submit button,
You must check if all mandatory fields are filled. If so, then proceed, else prompt to fill the
missing fields.

Once proceeded, your form should generate a unique enrollment id and export all data to a
file which may be unique per application or may append to existing common file with other
entries- your choice to design.

The form also provides an option to upload the CV and SOP. So implement a File chooser and
uploader, a saver rather. As of now, all these uploaded files need to be saved in a common directory
of the same machine, appropriately rename such as Enrollmentid_CV.extension


At admin’s end:
-----------------------
Design a UI to fetch data from the database file based on certain filters. The expected filters are
provided in the screenshots(at the end of this document) of the expected layout. The filter GUI
consists of three tab panes, the layout of each has been provided in the screenshot. All the expected
filters are listed in the screenshots of the layout itself.
It is not necessary to apply all the filters in one go. You may just set one of the filters and leave the
rest as default. The functionality should nevertheless support applying multiple filters altogether, eg.
List out all applicants with a Graduation percentage greater than 80% and have B.Tech degree with a
Department of Computer Science- this involves three filters.
On submitting the filter, your window/scene should navigate to another scene/window where the
GUI should list the filtered entries in tabular form with the following attributes: (The screenshot for
the same has been provided)


EnrollmentID

Name of Applicant

Link/Button to a data file that contains all the data that was filled in the form by that
particular applicant. So clicking on this link/button should open the data file in the default
program(say Adobe Reader for a pdf if you are converting the data file into a pdf though it is
your design choice). This may be of help:
https://docs.oracle.com/javafx/2/api/javafx/application/HostServices.html


Sanity checks- date should not be in future, Marks Percentage should be an integer <= 100 and =>0,
GATE score should be valid etc.
